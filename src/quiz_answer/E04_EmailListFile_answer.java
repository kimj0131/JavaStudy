package quiz_answer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile_answer {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("myfiles/emails.txt");

			Matcher matcher = Pattern.compile("(.+@.+)")
					.matcher(D10_ReporterList_answer.emails);
			
			while (matcher.find()) {
				out.write(matcher.group(1).getBytes());
				out.write('\n');
			}
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
