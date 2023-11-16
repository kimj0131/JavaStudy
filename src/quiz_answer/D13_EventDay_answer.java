package quiz_answer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_EventDay_answer {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar target = Calendar.getInstance();
		
		target.add(Calendar.YEAR, 1);
		
		SimpleDateFormat eventDayFormay = new SimpleDateFormat("yyyy-MM-dd EEEE");
		
		while(today.before(target)) {
			int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
			int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
			int dayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			
			if(dayOfMonth == 18 && dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[[%s]]\n", eventDayFormay.format(today.getTime()));
				System.out.println("[NOTICE] 1 + 1 이벤트, 20% 할인 이벤트 모두 진행중!");
			} else if(dayOfMonth == 18) {
				System.out.printf("[[%s]]\n", eventDayFormay.format(today.getTime()));
				System.out.println("[NOTICE] 1 + 1 이벤트 행사 진행중!");
			} else if(dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[[%s]]\n", eventDayFormay.format(today.getTime()));
				System.out.println("[NOTICE] 20% 할인 이벤트 진행중!");
			}
			
			today.add(Calendar.DATE, 1);
		}
	}
	
}
