package company_package;
interface Student{
	public void meth1(int a);
}
//class Person{
//	public void meth1() {
//		System.out.println("this is mentod 1");
//	}
//}
public class Java_Practice_LambdaFunction {

	public static void main(String[] args) {
		
		
//		Person p = new Person();
//		p.meth1();
		
		
		
		// you can avoid above line of code using lambda function
		Student obj = (a)->{
			System.out.println("----this is a method----"+ a );
		};
		
		obj.meth1(999);
		
	}
}
