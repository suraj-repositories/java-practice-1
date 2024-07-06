package Start_Advance;
//Annotations : annotations a form of metadata, provides data about a program 
	//				that is not part of the program itself
		
	// example - @Override , @SuppressWarning etc.	




import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// creating custom annotations
@Retention(RetentionPolicy.RUNTIME)		//another value is source for compile time execution
@Target(ElementType.METHOD)		// we can use this only for methods

@interface MyCustomAnnotation{
	int value();
}


public class Ad_02_Annotations {
	
	@MyCustomAnnotation(value = 10)
	public void sayHello() {
		System.out.println("my custom annotations ");
		
	}
	
	public static void main(String[] args) throws Exception {
			
		Ad_02_Annotations x = new Ad_02_Annotations();
		Method methodVal = x.getClass().getMethod("sayHello");
		
		MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
		System.out.println("value is : "+ myCustomAnnotation.value());
		
			
	}
}
