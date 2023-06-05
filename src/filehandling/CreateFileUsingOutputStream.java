package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingOutputStream {
	/*
	 *  1> FileInputStream  : to create read file
	 *  2> FileOutputStream : to write file
	 */
	
	   public static void main(String[] args) throws IOException {
		
		   FileOutputStream  file = new FileOutputStream("d://morning.txt"); 
		   file.write("Welcome to you in file handling".getBytes());
		   
		   file.close();
		   System.out.println("success");
		   
	}

}
