package myobj.parksys;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ParkingSystem {
	public static Map<String, LocalDateTime> parkList = new HashMap<>();
	private static String numOfEnter = "월16/화27/수38/목49/금50/토/일";
	
	/*
	  	{
	  		"월": {1, 6},
	  		"화": 
	  	}
	*/
	
	int lastNum1;
	int lastNum2;
	
	
	private LocalDateTime now = LocalDateTime.now();
	// String date = now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
	
	// 디버그용
	String date = "토";
	
	public ParkingSystem() {
		int index = numOfEnter.indexOf(date);
		if (date.equals(numOfEnter.charAt(index) + "") 
				&& !date.equals("토") && !date.equals("일")) {
			
			lastNum1 = Character.getNumericValue(numOfEnter.charAt(index + 1));
			lastNum2 = Character.getNumericValue(numOfEnter.charAt(index + 2));
		}
	}
	
	private void removeParkList(String scanVeh) {
		parkList.remove(scanVeh);
	}
	
	private void addParkList(String scanVeh) {
		parkList.put(scanVeh, now);
		
		//테스트용
		//LocalDateTime test = now.minus(120, ChronoUnit.MINUTES);
		//parkList.put(scanVeh, test);
		
	}
	
	public void parkingConsole() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1. 주차차량 등록\n2. 주차차량 정산\n3. 주차목록 확인\n4. 상위메뉴\n>>");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				System.out.println("차량번호를 입력\n>>");
				String scanNum = sc.nextLine();
				System.out.println("입력한 차량번호 : " + scanNum);
				
				boolean isParkingNow = isParkingToday(scanNum);
				if (isParkingNow) {
					addParkList(scanNum);
				} else {
					System.out.printf("[NOTICE] 금일 출입제한 차량번호입니다.\n\n");
				}
				System.out.println("===== 주차확인 =====");
				break;
				
			case 2:
				PaySystem ps = new PaySystem();
				System.out.print("차량번호입력\n>>");
				scanNum = sc.nextLine();
				System.out.println("입력한 차량번호 : " + scanNum);
				
				int fare = ps.parkingFareCal(scanNum, parkList);
				System.out.printf("[NOTICE]요금은 %d원 입니다.\n\n", fare);
				removeParkList(scanNum);
				return;
				
			case 3:
				Set<String> vehList = parkList.keySet();
				System.out.println("주차된 차량 목록\n" + vehList + "\n");
				break;
				
			case 4:
				return;
				
			default:
				System.out.println("\n\n[error]잘못된 입력입니다.\n\n");
				break;
			}
		}
	}
	
	
	private int vehicleNumberChk(String scanNum) {
		char lastChar = scanNum.charAt(scanNum.length() - 1);
		int lastDigit = Character.getNumericValue(lastChar);
		
		return lastDigit;
	}
	
	
	boolean isParkingToday(String scanNum) {
		
		int lastDigit = vehicleNumberChk(scanNum);

		switch (date) {
		case "월", "화", "수", "목", "금":
			System.out.printf("오늘은 [%s]요일 입니다.\n출입가능한 끝번호는 [%d, %d]입니다\n\n", date, lastNum1, lastNum2);
			if (lastDigit == lastNum1 || lastDigit == lastNum2) {
				return true;
			} else {
				return false;
			}
		case "토", "일":
			System.out.printf("오늘은 [%s]요일 입니다.\n출입제한은 없습니다.\n\n", date);
			return true;
		}
		return false;
	}
	
	
}
