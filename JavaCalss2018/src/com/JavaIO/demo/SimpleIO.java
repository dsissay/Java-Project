package com.JavaIO.demo;
import java.io.*;

public class SimpleIO {
	
	/*
	 * Create file managment ystem application
	 * create file
	 * write content on file
	 * read file
	 * append/add content to file
	 * commpress the file in zip format
	 * rename the file
	 * copy the file to another file
	 * delete file
	 * 
	 */
	
	//this is a byte stream example
	// it copies test form text 1 to text 2
	
	public static void main (String [] args) throws IOException
	{
//		
		//int i=System.in.read();//returns ASCII code of 1st character  
		//System.out.println((char)i);//will print the character  
		
		FileInputStream in = null;
      FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream("C:\\Users\\Daniel\\Desktop\\text1.txt");
//            out = new FileOutputStream("C:\\Users\\Daniel\\Desktop\\text2.txt");
//            int c;
//            System.out.println("Text Sucssfully copied");
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        } finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }
        
        // This is an example of character stream
		// it copies each character one bye one
        
        
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\Daniel\\Desktop\\text1.txt");
            outputStream = new FileWriter("C:\\Users\\Daniel\\Desktop\\text2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
	
	//this is buffered io stream
        
    }


