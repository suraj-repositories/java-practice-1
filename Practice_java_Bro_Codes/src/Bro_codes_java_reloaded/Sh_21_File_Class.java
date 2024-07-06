package Bro_codes_java_reloaded;

import java.io.File;

public class Sh_21_File_Class {
	public static void main(String[] args) {
			
		// file = a abstract representation of file and directory pathnames
		
		File file = new File("text_documents/shubh_1.txt");
		
		if(file.exists()) {
			System.out.println("This file exists in our project file");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			
			// file.delete();
			
		}
		else {
			System.out.println("The file doesn't exist");
		}
	}

}
