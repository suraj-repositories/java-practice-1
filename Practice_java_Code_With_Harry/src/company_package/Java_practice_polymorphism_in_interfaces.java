package company_package;

class Animals{
	public void animalSound() {
		System.out.println("the animal makes a sound");
	}
}
class Pigy extends Animals{
	@Override
	public void animalSound() {
		System.out.println("the pig says wee wee");
	}
}
class Dogy extends Animals{
	@Override
	public void animalSound() {
		System.out.println("the dog says bow wow");
	}
}
public class Java_practice_polymorphism_in_interfaces {
	public static void main(String[] args) {
		
		Animals myAnimal = new Animals();
	    Animals myPig = new Pigy();
	    Animals myDog = new Dogy();
	        
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	}
}
