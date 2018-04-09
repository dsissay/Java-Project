package com.JavaIO.demo;
import java.io.File;

public class DeleteFile {
	
	public void MyDeletedFile() {
	try {
		File file= new File ("C:\\Users\\Daniel\\Desktop\\newFile.zip");
		if (file.delete()) {
			System.out.println("File Deleted Sucuss fully");
			
		}else {
			System.out.println("File Deleted Sucuss fully");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}

}


}