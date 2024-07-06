package Bro_codes_java_reloaded;

import java.util.*;

class EncryptionProgram{
	
	private Scanner scanner;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private char[] letters;
	
	
	EncryptionProgram(){
		
		scanner = new Scanner(System.in);
		list = new ArrayList();
		shuffledList = new ArrayList();
		character = ' ';
		
		newKey();
		askQuestion();
		
	}
	private void askQuestion(){
		
		while(true) {
			System.out.println("*********************************************");
			System.out.println("What do you want to do");
			System.out.println("(N)newKey,(G)getKey,(E)encrypt,(D)decript,(Q)quit");
			
			char responce = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			switch(responce) {
			case 'N' -> newKey();
			case 'G' -> getKey();
			case 'E' -> encrypt();
			case 'D' -> decrypt();
			case 'Q' -> quit();
			default -> System.out.println("not a valid answer");
			
			}
		}
	}
	private void newKey() {
		character = ' ';
		list.clear();
		shuffledList.clear();
		
		for(int i=32;i<127;i++) {				// the space key is on the positiion of 32 and total keyboard keys are come in 30-126 || amd others  are reserved
			list.add(Character.valueOf(character));
			character ++;
		}
		
		shuffledList = new ArrayList(list);		// creating a copy of arraylist
		Collections.shuffle(shuffledList);		// there is a mehtod to shuffle list
		System.out.println("--A new key has been generated--");
	}
	private void getKey() {
		System.out.println("Key: ");
		for(Character x : list) {			// printing list characters
			System.out.print(x);
		}
		System.out.println();
		for(Character x : shuffledList) {
			System.out.print(x);
		}
		System.out.println();
		
	}
	private void encrypt() {
		System.out.println("Enter a message to be encripted :");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();		// changing the message into character array
		
		for(int i=0;i<letters.length;i++) {
			for(int j=0 ;j<list.size();j++) {
				if(letters[i] == list.get(j)) {
					letters[i]=shuffledList.get(j);
					break;
				}
			}
		}
		System.out.println("Enctypted : ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	
	}
	private void decrypt() {
		System.out.println("Enter a message to be decripted :");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();		// changing the message into character array
		
		for(int i=0;i<letters.length;i++) {
			for(int j=0 ;j<shuffledList.size();j++) {
				if(letters[i] == shuffledList.get(j)) {
					letters[i]=list.get(j);
					break;
				}
			}
		}
		System.out.println("Enctypted : ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	
	}
	private void quit() {
		System.out.println("----have a nice day----");
		System.out.println("_______QUIT________");
		System.exit(0);
	}
}

public class Sh_72_encription {
	public static void main(String[] args) {
		
		// OTP  =  One Time Pad
		/*
			encription technique that cannot be cracked,
			but requires the use of a one-time pre-shared
			key the same size as, or longer than, the message
			being sent.In this technique, plaintext is paired 
			with a random secret key (also referred to as a one-time pad).
		*/
		
		EncryptionProgram ep = new EncryptionProgram();

	}

}
