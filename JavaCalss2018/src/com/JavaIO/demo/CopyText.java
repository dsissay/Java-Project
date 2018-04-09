package com.JavaIO.demo;
import java.io.*;

public class CopyText {

	public void copyMyText() throws IOException {
		
		FileInputStream in = null;
	      FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\Daniel\\Desktop\\text1.txt");
	            out = new FileOutputStream("C:\\Users\\Daniel\\Desktop\\newFile.txt");
	            int c;
	            System.out.println("Text Sucssfully copied");
	            while ((c = in.read()) != -1) {
	                out.write(c);
	            }
        } finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
		
	}
	
	
}
}