package imge;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) {
		
		int w = 600;
		int h = 600;
		
		BufferedImage image = null;
		
		image  = readFromFile(w, h, image);
		
		writeToFile(image);
		
		
	}

	private static void writeToFile(BufferedImage image) {
	
		try {
			
			File output = new File("/home/hajar/Pictures/Screenshots/out.png");
			
			ImageIO.write(image, "png", output);
			
			System.out.println("wirting Complete");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static BufferedImage readFromFile(int w, int h, BufferedImage image) {
		
		try {
			File sample = new File("/home/hajar/Pictures/Screenshots/img.png");
			
			image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			
			image = ImageIO.read(sample);
			
			System.out.println("reading complete");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return image;
	}
	
	
	
}
