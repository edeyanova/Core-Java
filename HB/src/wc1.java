import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class wc1 {
	public static void wordCount(String file) throws IOException {
		FileReader fr = new FileReader(file);
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
	public static void lineCount(String file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		int count1 = 0;
		String lineCount;
		while ((lineCount = br.readLine()) != null) {
			count1++;
		}
		System.out.println(count1 - 1);
	}
	public static void charsCount(String file) throws IOException {
		int charsCount = 0;
		File files = new File(file);
		Scanner in = new Scanner(files);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) != ' ' && line.charAt(i) != '\n') 
					charsCount++;
			}
		}
		System.out.println(charsCount);
	}
	public static void wc(String file) throws IOException {
		wordCount(file);	
		lineCount(file);
		charsCount(file);
	}
	//public static void main(String[] args) throws IOException {
	//	wordCount("text.txt");	
	//	lineCount("text.txt");
	//	charsCount("text.txt");
	//	wc("text.txt");
	//}	
}
