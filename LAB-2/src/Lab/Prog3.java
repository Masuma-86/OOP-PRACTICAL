package Lab;
import java.util.Date;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date date = new Date();
	        System.out.println("Current date and time: " + date);
	        System.out.println("Time in milliseconds since Jan 1, 1970: " + date.getTime());
	        System.out.println("Date: " + date.getDate());
	        System.out.println("Day: " + date.getDay());
	        System.out.println("Month: " + date.getMonth());
	        System.out.println("Year: " + date.getYear());
	        System.out.println("Hours: " + date.getHours());
	        System.out.println("Minutes: " + date.getMinutes());
	        System.out.println("Seconds: " + date.getSeconds());

	}

}
