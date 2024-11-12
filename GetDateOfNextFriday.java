//Second Friday of next month:
package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class GetDateOfNextFriday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now();
		 LocalDate firstDayOfNextMonth = today.plusMonths(1).withDayOfMonth(1);
		 LocalDate firstFriday = firstDayOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		 LocalDate secondFriday = firstFriday.plusWeeks(1);
     System.out.println("Second Friday of next month: " + secondFriday);
	}
}
