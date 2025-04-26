package myPack;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FindDay {

	public static void main(String[] args) {
		System.out.println(" Day of Week  "+findDay(04,26,2025));
	}
	
	
	public static String findDay(int month, int day, int year) {

	       SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
	        Calendar cal = Calendar.getInstance();
	        cal.get(Calendar.DAY_OF_WEEK);
	        cal.set(year,month-1, day); 
	        String dayName = sdf.format(cal.getTime());
	     return dayName;

	    }
}
