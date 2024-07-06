package GuessNumber;


public class Game_GuessTheNumber {						 
	public static void main(String[] args) {
	//  MAIN CLASS
//		creating the object
		Game g=new Game();
		
//	 	create a boolean to check the condition 
		boolean check=false;
		int radom=g.genRandom();
		
// 		loop to repeat input and checking part
		while(check != true) {
			int numOfGuess=g.count++;                    // increase the number of guesses
			int input=g.getUserInput();								
			check=g.checkUserInput(radom, input,numOfGuess);
		}
	}
}
