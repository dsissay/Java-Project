package com.JavaIO.demo;
import java.io.*;

public class AppendFile {
	
	FileWriter fr;
	BufferedWriter bw;
	File file=null;
	
	
public void appMyFile(){
	try {
		file=new File("C:\\Users\\Daniel\\Desktop\\myFile.txt");
		String data="\n This a new second content";
		fr=new FileWriter(file.getAbsolutePath(), true);
		bw=new BufferedWriter(fr);
		bw.write(data);
		bw.close();
		System.out.println("Done Appending file");
	}catch (IOException e) {
		e.printStackTrace();
		System.out.println("Error While Appending the File");
	}
}
}
