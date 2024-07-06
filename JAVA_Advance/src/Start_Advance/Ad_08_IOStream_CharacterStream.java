package Start_Advance;

//For READING source file and writing content to target file character by character. 

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ad_08_IOStream_CharacterStream {

	public static void main(String[] args) throws IOException {

		FileReader readerStream = null;
		FileWriter writerStream = null;
		
		try {
			readerStream = new FileReader("text_docs/char_source.txt");
			writerStream = new FileWriter("text_docs/char_dest.txt");
			
// READING source file and writing content to target file character by character. 
			int content;
			while((content = readerStream.read()) != -1) {
				writerStream.append((char) content);
			}
			
		}finally {
			if(readerStream != null) {
				readerStream.close();
			}
			if(writerStream != null) {
				writerStream.close();
			}
		}

	}

}
