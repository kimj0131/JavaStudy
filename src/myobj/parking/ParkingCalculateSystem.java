package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ParkingCalculateSystem {
	
	public static Map<DayOfWeek, Integer[]> dayOfWeekNum = new HashMap<>();
	
	private Map<String, LocalDateTime> parkingList = new HashMap<>();
	
	LocalDateTime now = LocalDateTime.now();
	
	private static DateTimeFormatter parkingTimeFormat =
			DateTimeFormatter.ofPattern("MM-dd(E)/HH:mm");
	
	public ParkingCalculateSystem() {
		dayOfWeekNum.put(DayOfWeek.MONDAY, new Integer[] {1, 6});
		dayOfWeekNum.put(DayOfWeek.TUESDAY, new Integer[] {2, 7});
		dayOfWeekNum.put(DayOfWeek.WEDNESDAY, new Integer[] {3, 8});
		dayOfWeekNum.put(DayOfWeek.THURSDAY, new Integer[] {4, 9});
		dayOfWeekNum.put(DayOfWeek.FRIDAY, new Integer[] {5, 0});
		dayOfWeekNum.put(DayOfWeek.SATURDAY, new Integer[] {-1});
		dayOfWeekNum.put(DayOfWeek.SUNDAY, new Integer[] {-1});
	}
	
	
	public void consoleSystem() {
		// 차량 확인
		Car car1 = Cars.getRandomCar();
		String carNum = car1.carNum;
		String carType = car1.carType;
		LocalDateTime entryTime = car1.entryTime;
		LocalDateTime exitTime = car1.exitTime;
		
		addCar(carNum);
	}
	public void removeCar(String carNum) {
		parkingList.remove(carNum);
	}
	
	public void addCar(String carNum) {
		if (isCarFivedayVeh(carNum)) {
			parkingList.put(carNum, now);
		}
	}
	
	public void showParkingInfo() {
		String carNum = null;
		System.out.printf("[%s]의 주차정보 [%s]부터 주차했습니다.\n",
				carNum, parkingList.get("").format(parkingTimeFormat));
	}
	
	public void showParkingList() {
		System.out.println(parkingList);
	}
	
	public boolean isCarFivedayVeh(String carNum) {
		int lastNum = Character.getNumericValue(carNum.charAt(carNum.length() - 1));
		Integer[] notEnterNum = dayOfWeekNum.get(now.getDayOfWeek());
		switch (now.getDayOfWeek()) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
				System.out.printf("금일 출입 불가한 차량의 마지막번호는 [%d], [%d] 입니다.", notEnterNum[0], notEnterNum[1]);
				if (notEnterNum[0] == lastNum || notEnterNum[1] == lastNum) {
					return false;
				} else {
					return true;
				}
			case SATURDAY, SUNDAY :
				return true;
		}
		return true;
	}
	
	public int timeCal() {
		int min = 0;
		
		return min;
	}
	
	public int chargeCal() {
		int charge = 0;
		
		return charge;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
}
