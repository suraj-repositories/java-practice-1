package company_package;

class Employee{
	private int id ;
    private	String name;
    
    public void setName(String n) {			// SETTER
    	name = n;
    }
    public String getName() {				// GETTER
    	return name;
    }
    public void setId(int n ) {				// SETTER
    	id = n;
    }
    public int getId() {					// GETTER
    	return id;
    }
}
public class Java_getter_setter {
	public static void main(String[] args) {
		System.out.println("----GETTER, SETTER & CONSTRUCTOR----");
		
		Employee shubh=new Employee();
		
//		without private
//		shubh.id=234;
//		shubh.name="Shubham_kumar";  // throws error due to private access modifiers
		
		shubh.setName("Shubham kumar");
		shubh.setId(2213505);
		
		System.out.println("NAME OF THE EMPLOYEE IS "+ shubh.getName());
		System.out.println("THE ID OF THE EMPLOYEE IS : "+shubh.getId());
	}

}