
import java.io.*;
import java.util.*;


public class FileUtils {
	public static String readFrom(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader (file));
		String line;
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine())!=null){
			sb.append(line + "\n");
		}
		reader.close();
		return sb.toString();
	}
	public static void writeTo(String filename, String text) throws IOException{
		File file = new File(filename);
		BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		out.write(text);
		out.close();
	}
	

}
