package com.JavaIO.demo;

/*
 * 	/*
	 * Create file managment System application
	 * create file
	 * write content on file
	 * read file
	 * append/add content to file
	 * Compress the file in zip format
	 * rename the file
	 * copy the file to another file
	 * delete file
	 * 
	 */
 

import java.io.File;
import java.io.IOException;
import java.io.*;

public class FileManagment {
	public static void main (String [] args) throws IOException
	{
//		 CreateFile fl=new CreateFile();
//		 fl.fileCreated();
//		
//		 fileWritter();
//		 ReadFile();
//		 appendMyFile();
//		 renameFile();
//		 copyText();
		// CompressText();
		DeleteMyFile();
	
	}

	

	public static void fileWritter() {
		WriteContentOnFile wt= new WriteContentOnFile();
		wt.fileWritten();
	}
	
	public static void ReadFile() throws IOException {
		
		//FileReader fr=new FileReader();
//		
//		try{
//			fr.myFileReader();
//		}catch (IOException e) {
//			System.out.println("File is not Found I said");
//			e.printStackTrace();
//		}
//				
		}
	public static void appendMyFile() {
		
		AppendFile ap= new AppendFile();
		ap.appMyFile();
		
	}
	
	public static void renameFile() {
		RenameFile rn=new RenameFile();
		rn.renameMyfile();
	}
	
	public static void copyText() throws IOException {
		CopyText ct=new CopyText();
		ct.copyMyText();
	}
	public static void CompressText() throws IOException {
		CompressFile cf = new CompressFile();
		cf.CompressMyFile();
		
	}
	public static void DeleteMyFile() throws IOException {
		DeleteFile df = new DeleteFile();
		df.MyDeletedFile();
		
	}
}

