package Start_Advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// NIO package is same as IO but it gives the functionality at the kof multithreading
// non-blocking input output in java

public class Ad_18_NIO_package {

	public static void main(String[] args) throws IOException {
	
		/* To reading from a file */
		
//		FileInputStream fin = new FileInputStream("text_docs/NIOsource.txt");     // because of we are working with channels we need to create a file channel 
//		FileChannel readChannel = fin.getChannel();								  // if we work with socket we need to create a socket channel
//		ByteBuffer readBuffer = ByteBuffer.allocate(1024);		// creating a byte buffer and setting the size of the buffer with 1024 byte of 1MB
//		int result = readChannel.read(readBuffer);
//		System.out.println("File readed successfully : " + result);
		
		
		
		
		/* To writting within a file */
		
		FileOutputStream fout = new FileOutputStream("text_docs/NIOdest.txt");
		FileChannel writeChannel = fout.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
		String message = "This is a test String";
		writeBuffer.put(message.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.println("file witten successfully");
		
		
	}

}
