package Bro_codes_java_reloaded;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sh_23_FileReader_Class {
	public static void main(String[] args) {
		
		// FileReader = read the contents of a file as a stream of characters. One by one
		// 				read() returns an int value which contains the byte value when read()
		// 				returns -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("text_documents/art.txt");
			int data = reader.read();			// read() -> it returns the ascii value of first character
 		
			
			while(data != -1) {
				System.out.print((char)data);			// once it prints the value 
				data = reader.read();					// it reads new characters ascii value
				
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
