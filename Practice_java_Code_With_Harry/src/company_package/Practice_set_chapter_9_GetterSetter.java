package company_package;

class Cylinder{
	private int radius;
	private int height;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public double surfaceArea() {
		return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
	
}
public class Practice_set_chapter_9_GetterSetter {

	public static void main(String[] args) {
		
		// problem 1
		Cylinder myCylinder=new Cylinder();
		myCylinder.setHeight(12);
		System.out.println(myCylinder.getHeight());
		myCylinder.setRadius(20);
		System.out.println(myCylinder.getRadius());
	
		// problem 2
		System.out.println("THE SURFACE AREA OF A CYLINDER IS : "+ myCylinder.surfaceArea());
		System.out.println("THE VOLUME OF A CYLINDER IS : "+ myCylinder.volume());
		
		
		
	}
}
