package GuessNumber;

import java.util.Scanner;
import java.lang.Math;


class Game{
		public int random;
		public int input;
		public int count=0;
		
		
		// constructor can invoke in the time of making object
		Game(){					
			System.out.println("---------------- GAME ----------------");
			System.out.println("---------- GUESS THE NUMBER ----------");
			System.out.println("");
		}
		
		// generating random number
		public int genRandom() {  		
			double rand=Math.random()*(100-0+1)+0;
			int random=(int) rand;
			return random;
		}
		
		// taking user input 
		public int getUserInput() {		
			
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			try {
				System.out.print("Guess the number (0-100): ");
				input=sc.nextInt();
				return input;
			}
			catch(Exception e){
				
			}
			return -1;
		}
		
		//testing the user input it is equal,big,small
		public boolean checkUserInput(int random,int input,int numOfGuess ) {  
			if(input>100 || input<0) {
				System.out.println("\n!!!--------Invalid Number-------!!!");
				System.out.println("___please enter real number between 0 to 100____\n");
				return false;
			}
			else {
				if(random == input) {
					System.out.println("\n\n--------YOU WIN---------\n");
					System.out.println("......Congratulations you guessed the number......");
					System.out.format("\nNumber of guesses : %d" ,numOfGuess+1);
					return true;
				}
				else if(random > input){
					System.out.println("Too small...");
					return false;
				}
				else {
					System.out.println("Too big...");
					return false;
				}
			}
		}
}

