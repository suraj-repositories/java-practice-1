package Start_Advance;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.io.File;

public class Ad_14_Images {
	public static void main(String[] args) {
		
		int width = 964;
		int height = 640;
		
		BufferedImage image = null;
		
		image = readFromFile(width, height, image);
		 writeToFile(image);
	}

	

	private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
		
		try {
			
				File sampleFile = new File("Images/IT_logo.png");
		
			
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			// Reading input file
			image = ImageIO.read(sampleFile);
			
			System.out.println("Reading Complete : " + image);
			
		}
		catch(IOException e) {
			System.out.println("Error : " + e);
		}
		
		return image;
	}
	
	private static void writeToFile(BufferedImage image) {
		
		try {
			File output = new File("OutImages/out.png");
			
			ImageIO.write(image, "png", output);
			
			System.out.println("Writing Complete.");
			
		}
		catch(IOException e) {
			System.out.println("Error : " + e);
		}
		
	}
}
