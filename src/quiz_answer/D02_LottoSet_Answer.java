package quiz_answer;

import java.util.HashSet;

public class D02_LottoSet_Answer {

	public static void main(String[] args) {
		HashSet<Integer> ticket = new HashSet<>();
		
		while(ticket.size() < 6) {
			ticket.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(ticket);
	}
	
}
