package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E07_Copy2 {
	// 폴더 이름을 전달하면 해당 폴더 이름에 2를 붙이 새 폴더 안에
	// 모든 내용을 복사하는 메서드를 만들어보세요
	public static void main(String[] args) {
		
		String src = "./myfiles/";
		String dst = src.substring(0, src.length() - 1) + "2/";
		
		copyDirectory(src, dst);
		
	}
	
	public static String cutParentDir(String path, File src) {
		return src.toString().substring(path.indexOf(path.toString()));
	}
	
	static Set<String> allDirSet = new HashSet<>();
	public static List<String> findInnerDir(File src) {
		
		for (File srcDir : src.listFiles()) {
			if (srcDir.isDirectory()) {
				findInnerDir(srcDir);
				allDirSet.add(src.toString());
			} else {
				allDirSet.add(src.toString());
			}
		}
		System.out.println(allDirSet);
		List<String> allDirList = new ArrayList<>(allDirSet);
		System.out.println(allDirList);
		return allDirList;
	}
	
	public static void copyDirectory(String src, String dst) {
		File srcPath = new File(src);
		File dstPath = new File(dst);
		
		if(!dstPath.exists()) {
			dstPath.mkdirs();
		}
		
		List<String> path = new ArrayList<>(findInnerDir(srcPath));
		System.out.println("건네받은 리스트" + findInnerDir(srcPath));
		for (int i = 0; i < path.size(); i++) {
			System.out.println("path :" + path);
			System.out.println("test:" + cutParentDir(path.get(i), srcPath));
		}
		
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
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			
			if (ext.equals(".txt")) {
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
}
