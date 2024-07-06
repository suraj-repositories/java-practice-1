package Bro_codes_java_reloaded;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

class Users0 implements Serializable{
	String name;
	String password;
	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
}

public class Sh_65_Serializer {
	public static void main(String[] args) throws IOException {
		
		// Serialization = The process of converting an object into a byte system.
		//					Persists (saves the state) the object after program exits
		//					This byte stream can be saved as a file or sent over a network
		//					Can be sent to a different machine
		//					Byte stream can be saved as a file (.ser) which is platform independent 
		//					(Think of this as if you're saving a file with the object's information)
		
		// Deserialization = The reverse process of converting a byte stream into an Object.
		//					(Think of this as if you're loading a saved file)
	
		// 					Steps to Serialize
		//					---------------------------------------------------------------
		// 					1. Your object class should impliment Serializable interface
		//					2. add import java.io.Serializable;
		// 					3. FileOutputStream fileOut = new FileOutputStream(file path);
		// 					4. ObjectOutputStream out = new ObjectOutputStream(file Out);
		// 					5. out.writeObject(objectName)
		// 					6. out.close();  fileOut.close();
		// 					---------------------------------------------------------------
		
		Users0 user = new Users0();
		
		user.name = "shubham kumar";
		user.password = "shubh@123";
		
		FileOutputStream fileOut = new FileOutputStream("serialize_bytecode/UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("object Info saved....");
		
		
		long UID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(UID);
		// -5046538454368878271
	}
}
