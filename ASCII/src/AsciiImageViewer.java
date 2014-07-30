import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


import javax.imageio.ImageIO;


public class AsciiImageViewer {


    private static final int CONSOLE_SIZE = 130;
    private static BufferedImage image;


    private static void getPixels(int intensity) {
        if (intensity > 240) {
            System.out.print(" ");
        } else if (intensity > 200 && intensity <= 240) {
            System.out.print(".");
        } else if (intensity > 160 && intensity <= 200) {
            System.out.print("*");
        } else if (intensity > 120 && intensity <= 160) {
            System.out.print("$");
        } else if (intensity > 80 && intensity <= 120) {
            System.out.print("#");
        } else if (intensity > 40 && intensity <= 80) {
            System.out.print("&");
        } else {
            System.out.print("@");
        }
    }


    private static int getRange(BufferedImage image) {
    	int range;
        if (image.getWidth()>CONSOLE_SIZE) {
        	range = image.getWidth() / CONSOLE_SIZE + 1;
        }
        else {
        	range = 1;
        }
        return range;
    }
  
    private static int getIntensity(int x, int y) {
    	Color color = new Color(image.getRGB(x,y), false);
        return (color.getRed() + color.getGreen() + color.getBlue()) / 3;
    }

    private static int getAverageIntensity(int x, int y, int range, BufferedImage image) {
        int averageIntensity = 0;
        for (int j = y; j < y + range; y++) {
            for (int i = x; i < x + range; x++) {
                final int redGreenBlue = image.getRGB(x, y);
                final Color color = new Color(redGreenBlue, false);
                averageIntensity += getIntensity(j,i);
            }
        }
        return averageIntensity / (range * range);
    }


    public static void ASCII(BufferedImage image) {
    	int range = getRange(image);
    	for(int y = 0; y < image.getHeight() && y + range < image.getHeight(); y += range) {
    		for(int x = 0; x < image.getWidth() && x + range < image.getWidth(); x += range) {
    			getPixels(getAverageIntensity(x, y, range, image));
    		}
    		System.out.println();
    	}
    }
    
   public static void main(String[] args) throws IOException {
	   final Path path = Paths.get(args[0]);
	   final BufferedImage image = ImageIO.read(path.toFile());
	   ASCII(image);
}
}
