package Bro_codes_java_reloaded;

import java.io.FileWriter;
import java.io.IOException;

public class Sh_22_FileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("text_documents/poem.txt");			// it creates a new file with the passed name
			writer.write("This is a poem written by poet.\nRoses are red.\nGrapes are green.");		// to writer in the file and it overrite the text
			writer.append("\nThis is append method.");			// to add new line in the file
			writer.close();				// make sure to close the file
			System.out.println("Task successfully completed..");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
