package com.JavaIO.demo;

/*
 * Create file managment ystem application
	 * create file
	 * write content on file
	 * read file
	 * append/add content to file
	 * Compress the file in Zip format
	 * rename the file
	 * copy the file to another file
	 * delete file
 */

import java.io.File;
import java.io.IOException;


public class CreateFile {
	
	
	
	
	static File myFile=new File ("C:\\Users\\Daniel\\Desktop\\myFile.txt");
	public File fileCreated() {
	
	boolean b= false;
	 try {
		 b=myFile.createNewFile();
	 } catch (IOException e) {
		 System.err.println("There is an error");
	 }
if (b) {
	 System.out.println("File Created");
}
else {
	System.out.println("The file already excisted");
}
return myFile;
	
	}
	
}
