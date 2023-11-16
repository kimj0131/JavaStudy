package quiz_answer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E07_Copy2_answer {
	
	public static void main(String[] args) {
		copyDirectory("myfiles");
	}
	
	
	public static void copyDirectory(File srcDir, File dstDir) {
		if(!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			System.out.println("-----------------");
			System.out.println("getPath() : " + srcFile.getPath());
			System.out.println("getName() : " + srcFile.getName());
			
			if(srcFile.isDirectory()) {
				copyDirectory(srcFile, new File(dstDir, srcFile.getName()));
			} else {
				copyFile(srcFile, new File(dstDir, srcFile.getName()));
			}
		}
		
	}
	// 오버로딩을 사용해 재귀함수에 필요없는 동작을 분리
	public static void copyDirectory(String path) {
		copyDirectory(new File(path), new File(path + 2));
	}
	
	
	public static void copyFile(File srcFile, File dstFile) {
		// try문의 ()안에서 선언한 객체는 try문의 범위를 벗어나면 자동으로 close()메서드를 호출한다(AutoClose)
		try (FileInputStream in = new FileInputStream(srcFile);
			FileOutputStream out = new FileOutputStream(dstFile);) 
		{
			
			out.write(in.readAllBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
