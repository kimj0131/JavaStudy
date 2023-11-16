package quiz;

public class A06_Pyramid {
	
	public static void main(String[] args) {
		
		// printf()의 서식 문자 옵션을 사용해 역피라미드를 완성하세요 
		
		String str = "***";
		char ch = '*';
		
//		System.out.printf("%c%c%c%c%c%c%c%c%c\n",ch,ch,ch,ch,ch,ch,ch,ch,ch);
//		System.out.printf("%2c%c%c%c%c%c%c\n",ch,ch,ch,ch,ch,ch,ch);
//		System.out.printf("%3c%c%c%c%c\n",ch,ch,ch,ch,ch);
//		System.out.printf("%4c%c%c\n",ch,ch,ch);
//		System.out.printf("%5c",ch);
		
		System.out.printf("%s%s%s\n",str,str,str);
		System.out.printf("%4s%s%c\n",str,str,ch);
		System.out.printf("%5s%c%c\n",str,ch,ch);
		System.out.printf("%6s\n",str);
		System.out.printf("%5c\n\n",ch);
		
		// 의도한 정답
		String s1 = "*********";
		String s2 = "*******";
		String s3 = "*****";
		String s4 = "***";
		String s5 = "*";
		
		System.out.printf("%s\n", s1);
		System.out.printf("%8s\n", s2);
		System.out.printf("%7s\n", s3);
		System.out.printf("%6s\n", s4);
		System.out.printf("%5s\n\n", s5);
		
		// 제일 간단한 방법
		String s11 = "*********\n"
				   + " *******\n"
				   + "  *****\n"
				   + "   ***\n"
				   + "    *\n";
		System.out.printf("%s",s11);
		
	}
	
}
