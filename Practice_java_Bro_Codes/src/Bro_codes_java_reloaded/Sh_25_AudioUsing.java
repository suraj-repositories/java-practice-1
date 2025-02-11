// package Bro_codes_java_reloaded;
// note -> this library is use only .wav audio files ! mp3

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Sh_25_AudioUsing {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		File file = new File("first_audio.wav");
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		Scanner sc = new Scanner(System.in);
		String responce = "" ;		// we set the value of string to nothing
		
		
		while(!responce.equals("Q")) {
			System.out.println("P - Play\tS - Stop\tR - Reset\tQ - Quit");
			System.out.print("Enter your choice : ");
			responce = sc.next();
			responce = responce.toUpperCase();		// to change the input into Uppercase 
			
			switch(responce) {
			case "P" -> clip.start();	// here the audio is start in the background 
			case "S" -> clip.stop();
			case "R" -> clip.setMicrosecondPosition(0);
			case "Q" -> clip.close();
			default -> System.out.println("Not a vaild responce ......!");
			}
			
		}
		System.out.println("----thanks for listening----");
	}
}