package Bro_codes_java_reloaded;
// note -> this library is use only .wav audio files ! mp3

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Sh_24_Audio_Using {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		File file = new File("audios/first_audio.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		clip.start();			// here the audio is start in the background and
								// our program ignore this and compiler terminate the program 
		
		// to overcome this problem we need to continue the program by 
		// 1. using loops		2. user input		3. other methods
		
		Scanner sc = new Scanner(System.in);
		String responce = sc.next();
	
		
	}
}
