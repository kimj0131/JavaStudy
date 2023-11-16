package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_EventDay {
	/*
		실행하면 오늘로부터 앞으로 1년간의 모든 이벤트 날짜를 출력해주는 프로그램을 만들어보세요
		
		1+1 이벤트 : 매월 18일
		20% 할인 이벤트 : 홀수번째 금요일
		
		※ 이벤트 날짜가 겹치는 날에는 둘 모두 적용됨을 알려줘야 한다.
	*/
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE");
		Calendar now = Calendar.getInstance();
		System.out.println("### 금일 ###\n" + sdf.format(now.getTime()) + "\n---------------");
		Calendar begin = Calendar.getInstance();
		
		now.add(Calendar.YEAR, 0);
		begin.add(Calendar.YEAR, 1);
		
		
		int leapYear_day = begin.get(Calendar.DAY_OF_YEAR) 
				- now.get(Calendar.DAY_OF_YEAR);
		int day = 0;
		while (day++ < 365 + leapYear_day) {
//			System.out.println(sdf.format(now.getTime()));
			if(now.get(Calendar.DAY_OF_MONTH) == 18 
					&& now.get(Calendar.DAY_OF_WEEK) == 6 
					&& now.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1) {
				System.out.println(sdf.format(now.getTime()));
				System.out.println("1+1 이벤트와 20% 할인 이벤트를 동시에!\n");
			} else {
				if (now.get(Calendar.DAY_OF_MONTH) == 18) {
					System.out.println(sdf.format(now.getTime()));
					System.out.println("1+1 이벤트\n");
				}
				if (now.get(Calendar.DAY_OF_WEEK) == 6 
						&& now.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1) {
					System.out.println(sdf.format(now.getTime()));
					System.out.println("20% 할인 이벤트\n");
				}
			}
			now.add(Calendar.DATE, 1);
		}
		
	}
}

