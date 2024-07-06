package Start_Advance;

enum Color{
	RED("red"), GREEN("green") , BLUE("blue");

	public String value;
	
	
	Color(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
public class Ad_01_ENUM {

	public static void main(String[] args) {
		
		Color c1 = Color.RED;
		
//		System.out.println(c1.name());
//		System.out.println(c1.getValue());
		
		for(Color color : Color.values()) {
			System.out.println("Enum values : "+ color.getValue());
			
		}
		
	}

}
