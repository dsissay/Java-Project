package com.JavaIO.demo;
import java.io.*;
public class RenameFile {

	public void renameMyfile() {
		File oldfile=new File("C:\\Users\\Daniel\\Desktop\\myFile.txt");
		File newfile=new File ("C:\\Users\\Daniel\\Desktop\\newFile.txt");
		boolean flag=oldfile.renameTo(newfile);
		if (flag) {
			System.out.println("File Sussufull Renamed");
			
		}else {
			System.out.println("un abale to rename file");
		}
	}
}
