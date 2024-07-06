package Start_Advance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialize : to serialize an object means to convert its state to a byte 
//				stream so that the byte stream can be reverted back into a copy
// 				of the object.

class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String address;
	
	transient int x;		// for abstraction -- user can't see the specific thing
	// we can not see the value of transient varible after deserialization
	
	
	// transient int x
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return ("Student name is : "+ this.getName() +
				" , age is : " + this.getAge() +
				" , and address is : " + this.getAddress());
	}
}


public class Ad_03_Serialization {

	public static void main(String[] args)  {
		
		Student student = new Student("john", 25 , "this is my address");
		student.setX(100);		// set the value of x which is transient variable 
		
		String filename = "text_docs/textDocument";
		
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		
		// serialization
		
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("Object has been serialized : \n"+student);
			
		}
		catch(IOException e) {
			System.out.println("IO exception ! ");
			
		}
		
		// Deserialization
		
		FileInputStream fileIn  = null;
		ObjectInputStream objIn = null;
		
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject();
			System.out.println("Object has been deserialized : \n" + object);
			System.out.println("the deserialized value of x is : " + object.getX());
			
			objIn.close();
			fileIn.close();
		}
		catch(IOException  e) {
			System.out.println("IO exception !");
		}
		catch(ClassNotFoundException  e) {
			System.out.println("IO exception !");
		}
	}
}
