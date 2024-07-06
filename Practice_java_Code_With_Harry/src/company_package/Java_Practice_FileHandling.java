package company_package;
// the file is created in project_java folder where your data is stored
import java.io.*;
import java.util.Scanner;

public class Java_Practice_FileHandling {
	public static void main(String[] args) {
		
		
//		code to create a file 
		
		/*
		File myFile=new File("newFile.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			System.out.println("Error : file not created !");
			e.printStackTrace();
		}
		*/
		
		
//		 code to write a file
		
		/*try {
			FileWriter fileWriter=new FileWriter("newFile.txt");
			fileWriter.write("this is qure kjflkdj fsdf sklfjkl flkjfl dfjl sldfjlskdjflksd flkjdl");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
//		 read data from file
		
		File myFile=new File("newFile.txt");
		try {
			Scanner sc= new Scanner(myFile);
			while (sc.hasNextLine()) {
				String line= sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		delete a existing file
		
		/*File myFile=new File("newFile.txt");
//		 myFile.delete();						// you can also use only this method to delete file
 * 
		if(myFile.delete()) {
			System.out.println("this file is deleted : "+myFile.getName());
			
		}
		else {
			System.out.println("Some error occured while deleting the file !!!!!!!");
		}
		*/
	}
}
