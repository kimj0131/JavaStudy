package quiz_answer;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Set;

import myobj.parking.Cars;
import myobj.parking.ParkingCalculateSystem;

public class D14_ParkingSystem_answer {
	
	public static void main(String[] args) {
		ParkingCalculateSystem ps = new ParkingCalculateSystem();
		
		Set<DayOfWeek> test = ps.dayOfWeekNum.keySet();
		for (DayOfWeek key : test) {
			System.out.println(key + Arrays.toString(ps.dayOfWeekNum.get(key)));
		}
		
		System.out.println(Cars.getRandomCar());
	}
}
