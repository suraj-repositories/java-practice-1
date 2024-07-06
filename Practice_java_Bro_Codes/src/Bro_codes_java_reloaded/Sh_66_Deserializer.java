package Bro_codes_java_reloaded;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

class Userz implements Serializable{
	String name;
	String password;
	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
}

public class Sh_66_Deserializer {
	public static void main(String[] args) throws IOException, ClassNotFoundException ,ClassCastException {
		
		// 						Steps to Deserialize
		//						-------------------------------------------------------------
		// 						1. Declare your object (don't instantiate)
		// 						2. Your class should implement Serializable interface 
		// 						3. add import java.io.Serializable;
		// 						4. FileInputStream fileIn = new FileInputStream(file path);
		// 						5. ObjectInputStream in = new ObjectInputStream(fileIn);
		// 						6. objectName = (Class) in.readObject();
		// 						7. in.close();		fileIn.close();
		//						-------------------------------------------------------------
		
		Userz user = null;
		
		FileInputStream fileIn = new FileInputStream("E:\\JAVA_PROGRAMS\\Practice_java_Bro_Codes\\serialize_bytecode\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		user = (Userz) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		long UID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(UID);
	}

}
