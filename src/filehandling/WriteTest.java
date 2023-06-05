package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	/*
	 *    1> FileWriter  : write file
	 *    2> FileReader  : read file
	 */
	
	public static void main(String[] args) throws IOException {
		
	FileWriter   file = new FileWriter("d://product.txt",true);
	
	  file.write("Name = Mobile\n");
	  file.write("Price = 40000\n");
	  file.write("Company = IPhone\n");
	  file.write("Quantity = 230\n");
	  
	  file.close();
	  System.out.println("success");
	
	}
	
	

}
