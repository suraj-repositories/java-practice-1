package Bro_codes_java_reloaded;

class Car_1{
	private String make;
	private String model;
	private int year;
	
	Car_1(String make,String model , int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
	}
	Car_1(Car_1 x){
		this.copy(x);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void copy(Car_1 x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}

public class Sh_16_copyObjects {
	public static void main(String[] args) {
		
		Car_1 car1 = new Car_1("chevrolet","camaro",2021);
		
//		Car_1 car2 = new Car_1("ford","Mustang",2022);
//		car2.copy(car1);
		
		Car_1 car2 = new Car_1(car1);		// this will do the same thing 
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	
		
	}
}
