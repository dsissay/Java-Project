package com.JavaIO.demo;
import java.io.*;

public class WriteContentOnFile {
	
	
		void fileWritten() {
		
	try{   
		
        FileWriter fw=new FileWriter("C:\\Users\\Daniel\\Desktop\\myFile.txt");    
        fw.write("Welcome to java Programming...");    
        fw.close();    
       }catch(Exception e){System.out.println("an able to write the file Content");}    
       System.out.println("Text Suscuss fully Written on File...");

    
		}
	
}
