package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("d://product.txt");

		System.out.println(file.isDirectory());
		System.out.println(file.exists());

		File folder = new File("d://java8am");
		folder.mkdir();

		// get all file names from folder
		String[] fileNames = folder.list();
		System.out.println(Arrays.toString(fileNames));

		// get all files from folder
		File[] files = folder.listFiles();

//		 for(File f : files) {
//			 
//			    FileReader  file1 = new FileReader(f.getAbsoluteFile());
//				BufferedReader br = new BufferedReader(file1);
//				
//				String line;
//				br.readLine();
//				
//				while((line = br.readLine()) != null) {
//					System.out.println(line);
////					String[] data = line.split(",");
////					System.out.println(data[1]);
//				}
//		 }
//		 

		Arrays.asList(files).forEach(f ->

		{
			try {
				System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		);

	}

}
