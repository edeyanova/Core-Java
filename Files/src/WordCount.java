import java.io.*;
import java.util.*;
public class WordCount {
	private int wordsCount;
	private int linesCount;
	private int charsCount;
	private void WordCount(String filename) throws IOException{
		File file = new File(filename);
		Scanner w = new Scanner (new FileInputStream(file));
		int count=0;
		while(w.hasNext()){
		    w.next();
		    count++;
		}
		System.out.println("Number of words: " + count);
	}
	private void LineCount(String filename) throws IOException{
		
	}
	private void Count(String filename) throws IOException{
		int charsCount = 0;
	    int wordsCount = 0;
	    int linesCount = 0;
	    Scanner fileScanner = null;
	    while (fileScanner.hasNextLine()) {
	        linesCount++;
	        String line = fileScanner.nextLine();
	        Scanner lineScanner = new Scanner(line);
	        // count the characters of the file till the end
	        while(lineScanner.hasNext()) {
	          wordsCount++;
	          String word = lineScanner.next();
	          charsCount += word.length();
	        } 

	      lineScanner.close();
	    }
	    fileScanner.close();
	}
	private int getWordCount(){
		return wordsCount;
	}
	private int getLineCount(){
		return linesCount;
	}
	private int getCharsCount(){
		return charsCount;
	}
}
