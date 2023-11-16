package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E07_Copy1 {
	/*
		1. myFiles의 파일들 중 .txt들을 mytxts에 복사해 보세요
		2. myFiles의 파일들 중 그림파일을 myimages 폴더에 복사해 보세요
	*/
	public static void main(String[] args) {
		File basic = new File("C:/JavaFullstack_KJH/javaworkspace/JavaStudy");
		File ori = new File(basic + "/myfiles/");
		File text = new File(basic + "/mytxts/");
		File img = new File(basic + "/myimages/");
		
		File[] dirs = {ori, text, img};
		
		for (File f : dirs) {
			if (!f.exists()) {
				f.mkdirs();
			}
		}
		
		File[] oriFiles = ori.listFiles();
		for(File f : oriFiles) {
			if(f.toString().indexOf('.') != -1) {
				
				FileInputStream in = null;
				FileOutputStream out = null;

				String[] imgExtList = {".jpg", ".gif", "png"};
				String str = f.getName().substring(f.getName().indexOf("."));
				
				if (f.getName().endsWith(".txt")) {
					try {
						in = new FileInputStream(f);
						
						byte[] allByte = in.readAllBytes();
						String readResult = new String(allByte);
						
						out = new FileOutputStream("./mytxts/" + f.getName());

						out.write(readResult.getBytes());
						
						in.close();
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				for (int i = 0; i < imgExtList.length; i++) {
					if (f.getName().endsWith(imgExtList[0])) {
						try {
							in = new FileInputStream(f);
							out = new FileOutputStream("./myimages/" + f.getName());
							
							// 버퍼 방식
							byte[] buffer = new byte[4096];
							
							int len;
							while ((len = in.read(buffer)) != -1) {
								out.write(buffer, 0, len);
							}
							
							// allByte 방식
//						byte[] allByte = in.readAllBytes();
							
//						for (int i = 0; i < allByte.length; i++) {
//							out.write(allByte[i]);
//						}
							
							in.close();
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}
}
