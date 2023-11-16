import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E04_JavaIO {
	/*
		# Java IO(Input/Output)
		
		- 자바에서는 스트림이라는 개념을 통해 프로그램의 입출력을 다룬다.
		- 프로그램으로 데이터가 들어오는 것은 입력(Input)이라고 한다.
		- 프로그램에서 데이터가 나가는 것을 출력(Output)이라고 한다.
		
		# Stream
		
		- 데이터가 전송되는 통로
		- 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다.
		- 데이터들이 프로그램에서 나가는 통로를 OutputStrem이라고 한다.
		- 데이터가 Stream으로 통해 전송되기 위해서는 해당 데이터를 byte타입으로 변환시켜야한다.
		  (byte타입이 가장 0과 1로 변환되기 쉽기때문)
	*/
	public static void main(String[] args) {
		// java.io.FileOutputStream
		try {
			FileOutputStream out = new FileOutputStream("myfiles/test.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			
			// "".getByte() : 해당 문자열을 byte[]로 바꾼 결과를 반환.
			out.write("\nHello, world".getBytes());
			out.write("\n안녕하세요~".getBytes());
			
			System.out.println("안녕하세요 : " + Arrays.toString("안녕하세요~".getBytes()));
			
			// 다 사용한 스트림은 반드시 수동으로 닫아줘야 한다.
			// (닫아야 하는 시점을 자바가 스스로 결정하지 못함)
			out.close();
			System.out.println("쓰기 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로를 찾을 수 없습니다..");
		} catch (IOException e) {
			System.out.println("쓰다가 뭔가 문제가 생겼습니다.");
		}
	}
}
