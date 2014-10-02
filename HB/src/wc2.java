import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class wc2 {
		public static void main(String[] args) throws IOException {
	        String text1 = new Scanner( new File("text.txt"), "UTF-8" ).useDelimiter("\\A").next();
		    BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		    String line = " ";
		    int lines = 0;
		    int words = 0;
		    int chars = 0;
		    String s = " ";
		    
		        while ((line=br.readLine())!=null) {
		        lines++;
		        }
		
		    StringTokenizer st=new StringTokenizer(text1);
		     while (st.hasMoreTokens()) { 
		        s = st.nextToken();
		          words++;  
		          for (int i = 0; i < s.length(); i++) {
		              chars++;
		              }
		        }
		     System.out.println("Lines: " + lines);
		     System.out.println("Words: " + words);
		     System.out.print("Chars: " + chars);
		 }
	}