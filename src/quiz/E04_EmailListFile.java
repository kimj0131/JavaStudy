package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile {
	// D01번 문제 기자들의 이메일들로만 이루어진 파일을 myfile밑에 생성해보세요
	public static void main(String[] args) {
		
		String regex = ".+\r\n(.+)\r\n.+\r\n.+\r\n(.+@.+)\r\n";
		
		Matcher matcher = Pattern.compile(regex).matcher(D10_ReporterList.emails);
		
		List<String> emailList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		while (matcher.find()) {
			String name = matcher.group(1);
			String email = matcher.group(2);
			
			emailList.add(email);
			nameList.add(name);
		}
		
		try {
			FileOutputStream out = new FileOutputStream("myfiles/email_list.txt");
			
			for (Integer i = 0; i < emailList.size(); i++) {
				String result = (i + 1) + " " + nameList.get(i) + " : " + emailList.get(i) + "\n";
				out.write(result.getBytes());
			}
			out.close();
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("작성중 문제가 발생했습니다.");
		}
		
	}
}
