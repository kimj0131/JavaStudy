package quiz;

import java.util.Scanner;

import myobj.parksys.ParkingSystem;

public class D14_ParkingSystem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ParkingSystem parkingSystem = new ParkingSystem();
		
		System.out.println("===== 주차관리 시스템 =====");
		while(true) {
			System.out.print("1. 주차관리 콘솔\n2. 종료\n>>");
			String menu = sc.next();
			if(menu.equals("1")) {
				parkingSystem.parkingConsole();
			} else if(menu.equals("2")) {
				break;
			} else {
				System.out.println("잘못입력 했습니다.");
			}
		}
	}
}


