package com.javacore.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		String zipFilePath = "D:\\tmp\\12700153file.zip";
		File dir = new File("D:\\tmp");
		dir.mkdirs();
		File zipFile = new File(zipFilePath /*+ "\\" + fileName + ".zip"*/);
		
		if (!zipFile.exists()) {//如果文件不存在，则创建
			zipFile.createNewFile();
		}
		
	}

}
