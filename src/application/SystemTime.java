package application;

import java.time.LocalDateTime;

public class SystemTime {

	private String time_and_date;
//	private char tab_time_and_date [];
	public int hour, minute, second;
	public int day, month, year;
	public String month_str[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	
	SystemTime(){ // CONSTRUCTOR
		getTime();
	}
	
	
	
	public String getTime() {
		
//		LocalDateTime.format(DateTimeFormatter RFC_1123_DATE_TIME);
		LocalDateTime localTimeAndDate = LocalDateTime.now();
		time_and_date = localTimeAndDate.toString();
		
		year =  localTimeAndDate.getYear();
		month = localTimeAndDate.getMonthValue();
		day = localTimeAndDate.getDayOfMonth();
		
		hour = localTimeAndDate.getHour();
		minute = localTimeAndDate.getMinute();
		second = localTimeAndDate.getSecond();

//		System.out.println(year+" "+month+" "+day+" "+hour+":"+minute+":"+second);
		
		return time_and_date;
	}
	
}
