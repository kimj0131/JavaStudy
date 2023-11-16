package quiz_answer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E07_Copy1_answer {
	
	public static void main(String[] args) {
		//copyTextFilesOnly("./myfiles/", "./mytxts_ans/");
		copyImageFilesOnly("./myfiles/", "./myimages_ans/");
	}
	
	public static void copyTextFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if(!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			if(srcFile.isDirectory()) {
				continue;
			}
			
			String fileName = srcFile.getName();
			// 파일 이름에 .이 포함되어있는 경우에 대비하여
			// indexOf()를 대신해 .의 위치를 뒤에서부터 찾는 lastIndexOf()를 사용해야 한다.
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			// System.out.printf("파일 이름은 %s이고 확장자는 %s 입니다.\n", fileName, ext);
			
			if (ext.equals(".txt")) {
				// 부모 디렉토리와 파일 이름으로 파일 객체 생성
				File dstFile = new File(dstDir, fileName);
				
				FileReader in = null;
				FileWriter out = null;
				try {
					in = new FileReader(srcFile);
					out = new FileWriter(dstFile);
					
					char[] buff = new char[1024];
					int len;
					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					try {
						if(out != null) {
							out.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static Set<String> IMAGE_EXTENSIONS = new HashSet<>();
	
	static {
		IMAGE_EXTENSIONS.add(".jpg");
		IMAGE_EXTENSIONS.add(".gif");
		IMAGE_EXTENSIONS.add(".png");
	}
	
	public static void copyImageFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if(!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			if(srcFile.isDirectory()) {
				continue;
			}
			
			String fileName = srcFile.getName();
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			if (IMAGE_EXTENSIONS.contains(ext)) {
				File dstFile = new File(dstDir, fileName);
				
				FileInputStream in = null;
				FileOutputStream out = null;
				// 이미지 파일은 바이트 단위로 복사해야 한다.
				try {
					in = new FileInputStream(srcFile);
					out = new FileOutputStream(dstFile);
					
					out.write(in.readAllBytes());
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						if(out != null) {
							out.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
