import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time  {
	private int hours, minutes, seconds;
    private int day, month, year;
    
    public Time() {
        
    }
    
    public Time(int hours, int minutes, int seconds, int day, int month, int year) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString() {
        return String.format("%02d:%02d:%02d %02d.%02d.%02d", hours, minutes, seconds, day, month, year);
    }


    //@Override
   // public String now() {
    //    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
    //    return dateFormat.format(new Date());
    //}


}
