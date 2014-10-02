
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	import java.util.StringTokenizer;

	public class wc {
	    public static void main(String[] args) throws IOException {
	        
	    String text = new Scanner( new File("way to your file"), "UTF-8" ).useDelimiter("\\A").next();
	    BufferedReader br=new BufferedReader(new FileReader("way to your file"));
	    String line = " ";
	    int lines = 0;
	    int words = 0;
	    int chars = 0;
	    String s = " ";
	    
	        while ((line=br.readLine())!=null) {
	        lines++;
	        }
	
	    StringTokenizer st=new StringTokenizer(text);
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
