package company_package;

class Circle{
	private float r;
	private float area;
	
	final float pi=3.14f;
	 
	public void setRadius(float x) {
		r = x;
	}
	public void setArea(float x) {
		area = x;
	}
	public float getRadius() {
		return r;
	}
	public float getArea() {
		return area;
	}
	
}
public class Java_getter_setter_AreaOfCircle {

	
	public static void main(String[] args) {
	
		System.out.println("LETS CHECK THE AREA AND RADIOUS OF A CIRCLE");
		
		Circle cir=new Circle();
		cir.setRadius(5);
		cir.setArea(0);
		
		System.out.println(cir.getRadius());
		System.out.println(cir.getArea());
	}
}
