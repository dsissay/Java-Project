package com.JavaIO.demo;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class CompressFile {
	
	public void CompressMyFile() {
		
		
		byte[] buffer= new byte[1024];
		
		try {
			FileOutputStream fos=new FileOutputStream ("C:\\Users\\Daniel\\Desktop\\newFile.zip");
			ZipOutputStream zos= new ZipOutputStream(fos);
			ZipEntry ze=new ZipEntry("C:\\Users\\Daniel\\Desktop\\newFile.txt");
			zos.putNextEntry(ze);
			FileInputStream in= new FileInputStream ("C:\\Users\\Daniel\\Desktop\\newFile.txt");
			int len;
			while ((len = in.read (buffer))>0){
				zos.write(buffer,0,len);
			}
			in.close();
			zos.closeEntry();
			zos.close();
			System.out.println("Done");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		}


}

