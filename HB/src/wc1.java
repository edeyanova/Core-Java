import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class wc1 {
	public static void wordCount() throws IOException {
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader (fr);
		String line = br.readLine();
		
		int count = 0;
		while (line != null) {
			String[] parts = line.split(" ");
			for (String w : parts) {
				count++;
			}
			line = br.readLine();
		}
		System.out.println(count - 1);	
	}
	public static void lineCount() throws IOException {
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader (fr);
		int count1 = 0;
		String lineCount;
		while ((lineCount = br.readLine()) != null) {
			count1++;
		}
		System.out.println(count1 - 1);
	}
	public static void charsCount() throws IOException {
		int charsCount = 0;
		File file = new File("text.txt");
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) != ' ' && line.charAt(i) != '\n') 
					charsCount++;
			}
		}
		System.out.println(charsCount);
	}
	public static void wc() throws IOException {
		wordCount();	
		lineCount();
		charsCount();
	}
	public static void main(String[] args) throws IOException {
		wordCount();	
		lineCount();
		charsCount();
		wc();
	}	
}
