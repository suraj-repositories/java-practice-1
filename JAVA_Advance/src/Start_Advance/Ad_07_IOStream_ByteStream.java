package Start_Advance;
// better than characterStream because it read the images, databases, and other type of files 
// where characterstream read only characters 


//For READING source file and writing content to target file a byte at a time 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// IO Streams : An I/O streams represents an input source or an output destination. A stream can represent 
//				many different kinds of sources and definitions including disk files , devices , other , 
//				programs, and memory array.

// ----- A program uses an input stream to read data from a source, one item at a time
// ----- A program uses an output stream to write data to destination, one item at a time

// ------- also see java.io.* class hierarchy

public class Ad_07_IOStream_ByteStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		
		try {
			inStream = new FileInputStream("text_docs/source.txt");
			outStream = new FileOutputStream("text_docs/dest.txt");
			
			// read a byte at a time , if it reached end of the file, return -1
			int content;
			while((content = inStream.read()) != -1) {
				outStream.write((byte) content);
				System.out.println(inStream);
				System.out.println(inStream.read());
			}
		}
		finally {
			if(inStream != null) {
				inStream.close();
			}
			if(outStream != null) {
				outStream.close();
			}
		}
		
	}

}
