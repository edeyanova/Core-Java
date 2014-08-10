import java.util.Date;


public class Time_Fool_Proof extends Exception{
	public Time_Fool_Proof(String message){
		super(message);
	}
	
		public static void main(String args[]) {
		     Date date = new Date();
		     String str = String.format("Current Date/Time : %tc", date );

		     System.out.printf(str);
		  }

}
