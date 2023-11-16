
public class B05_Operator03 {
	
	/*
		# 대입 연산자
		
		 = : 왼쪽의 변수에 오른쪽의 값을 넣는다.
		 
		# 복합 대입 연산자
		 
		 += : 왼쪽의 변수에 오른쪽의 값을 더해 누적시킨다.
		 -= : 왼쪽의 변수에 오른쪽의 값을 빼서 누적시킨다.
		 *= : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적시킨다.
		 /= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적시킨다.
		 %= : 왼쪽의 변수에 오른쪽의 값을 나눈 나머지를 저장한다.
		 
		# 단항 연산자
		 ++ : 해당 변수에 1을 더해 누적시킨다.
		 -- : 해당 변수에 1을 빼서 누적시킨다.
		 
		# 단항 연산자의 위치에 따른 차이
		 - 단항 연산자가 변수의 뒤에 붙어있는 경우		(후위표기법)
		  해당 줄의 모든 명령이 끝난 후에 값을 변화시킨다.
		  ex) a++, a--
		 
		 - 단항 연산자가 변수의 앞에 붙어있는경우		(전위표기법)
		  해당 줄의 명령을 실행하기 전에 값을 먼저 변화시킨다.
		  ex) ++a, --a
	*/
	public static void main(String[] args) {
		
		int num = 10;
		
		num = num + 2;
		num += 2;	//위의 것을 줄여서 표현한것.
		
		System.out.println(num);
		
		int a = 20;
		a += 5;
		System.out.println(a);	//25
		
		a -= 10;
		System.out.println(a);	//15
		
		a *= 3;
		System.out.println(a);	//45
		
		a /= 10;
		System.out.println(a);	//4
		
		a %= 3;
		System.out.println(a);	//1
		
		
		// boolean 타입의 복합 대입 연산자
		boolean readable = true;
		
		readable &= false;	//AND연산을 한 후 저장한다
		System.out.println(readable);
		
		readable |= true;	//OR연산을 한 후 저장한다.
		System.out.println(readable);
		
		readable ^= false;	//XOR 연산을 한 후 저장한다. (XOR : 서로 달라야 true)
		System.out.println(readable);
		
		
		int count = 10;
		
		count++;	//위의 것을 줄여서 표현 한 것
		System.out.println(count);	//11
		count++;
		System.out.println(count);	//12
		System.out.println(count++);//12	//후위표기법 : 이 줄의 문장의 명령이 끝나고 나서 더한다.
		System.out.println(++count);//13	//전위표기법 : 이 줄의 문장의 명령이 시작되기 전에 더한다.
		
	}
}
