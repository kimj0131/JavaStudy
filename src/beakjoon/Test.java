package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	
	public static void main(String[] args) {
		
		
		try(
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			String repeat = in.readLine();
			int rep = Integer.parseInt(repeat);
			System.out.println(rep);
			for (int i = 0; i < rep; i++) {
				int a = in.read();
				int b = in.read();
				out.write(a + b);
			}
			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
