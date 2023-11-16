
public class A03_VariableTypes {
	
	/*
		# 정수 타입 
		
		 - byte	(1byte, 8bit) 
		   2^8(256)가지의 값을 표현할 수 있다
		   -128 ~ -1 / 0 ~ 127 
		   
		 - short(2byte, 16bit)
		   2^16(65536)
		   -32768 ~ -1 / 0 ~ 32767
		   
		 - int	(4byte, 32bit)
		   2^32(4294967296)
		   -2147483648 ~ -1 / 0 ~2147483647
		 
		 - long	(8byte, 64bit)
		   2^64(18446744073709551616)
		   -9223372036854775808 ~ -1 / 0 ~ 9223372036854775807
		
		 - char	(2byte, 16bit, 양수만)
		   0 ~ 65535 까지의 값을 사용할 수 있다.(65536가지의 양수 값)
		    - 컴퓨터는 숫자만 기억할 수 있고, 각 문자의 번호를 확인하고 그에 맞는 문자 및 기호를 출력함
		   
		# 실수 타입
		
		 - 부동 소수점 방식을 이용한다
		 - float	(4byte)
		 - double	(8byte)
		
		# 참/거짓 타입
		
		 - boolean	 true, false 값이 들어감
		
		# 문자열
		
		 - String
		
	*/
	public static void main(String[] args) {
		
		byte byte_min = -128, byte_max = 127;
		short short_min = -32768, short_max = 32767;
		int int_min = Integer.MIN_VALUE, int_max = Integer.MAX_VALUE;
		long long_min = -9223372036854775808L, long_max = 9223372036854775807L;
		// 자바에서 미리 저장해놓은 각 타입의 최대/최소값이 있다.
		// 타입이름.MIN_VALUE / MAX_VALUE
		
		System.out.println("byte 타입의 최소값은 " + byte_min + "이고, 최대값은 " + byte_max + "입니다.");
		System.out.println("short 타입의 최소값은 " + short_min + "이고, 최대값은 " + short_max + "입니다.");
		System.out.println("short_min : " + Short.MIN_VALUE + " short_max : " + Short.MAX_VALUE);
		System.out.println();
		System.out.println("int 타입의 최소값은 " + int_min + "이고, \n최대값은 " + int_max + "입니다.");
		System.out.println("int_min : " + Integer.MIN_VALUE + " int_max : " + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("long 타입의 최소값은 " + long_min + "이고, \n최대값은 " + long_max + "입니다.");
		System.out.println("long_min : " + Long.MIN_VALUE + " \nlong_max : " + Long.MAX_VALUE);
		
		
		// char 타입에 넣는 정수값은 우리에게 보여줄 때 문자로 바꿔서 보여준다.
		// AC00 : 가
		char ch1 = 44032;
		int num1 = 44032;
		
		System.out.println(ch1);
		System.out.println(num1);
		
		// char 타입은 문자도 넣을 수 있다. (한단어만)
		char ch2 = 'F';	// ''(문자)도 실제로는 정수 값을 가지고 있다.
		char ch3 = '값';
		// 문자 타입 리터럴은 실제로 정수값이기 때문에 다른 정수타입에도 저장할 수 있다.
		int num2 = 'F';
		int num3 = '값';
		
		// 숫자 타입에 저장한 문자 리터럴을 출력하면 해당 문자의 실제 값을 확인할 수 있다.
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(num2);
		System.out.println(num3);
		// ASCII 코드 : 0 ~ 127 (유니코드 안에 포함되있다고 생각하면 됨)
		char ch4 = 65;
		
		System.out.println(ch4);
		
		
		// 그낭 소수만 적는 것은 double 타입이기 때문에
		// float에 저장하려고 할 때는 F를 붙여 크기를 줄여줘야 한다.
		float avg_score = 96.8F; 
		double avg_weight = 85.999;	/// double은 그냥 적어도 된다.
		
		System.out.println("평균 점수 : " + avg_score);
		System.out.println("평균 몸무게 : " + avg_weight);
		
		// boolean 타입은 변수의 이름이 중요하다.
//		boolean isMale = true;
//		boolean goonpil = true;
//		boolean rich = false;
//		boolean powerOn = true;
		
		// 문자열
		String welcomeMessage = ("어서오세요 환영합니다!");
		System.out.println(welcomeMessage);
	}
}




