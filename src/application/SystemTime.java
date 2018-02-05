package application;

import java.time.LocalDateTime;

public class SystemTime {

	private String time_and_date;
//	private char tab_time_and_date [];
	public int hour, minute, second;
	public int day, month, year;
	public String month_str[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	
	public String str_day, str_month, str_year, str_hour, str_minute, str_second;
	
	SystemTime(){ // CONSTRUCTOR
		getTime();
		correctionNumberString();
	}
	
	private void correctionNumberString() {
//		String tmp_string = new String();
				
		if (day >= 10)
			str_day = Integer.toString(day);
		else
			str_day = "0" + day;
		
		if (month >= 10)
			str_month = Integer.toString(month);
		else
			str_month = "0" + month;
		
		if (year >= 10)
			str_year = Integer.toString(year);
		else
			str_year = "0" + year;
		
		if (hour >= 10)
			str_hour = Integer.toString(year);
		else
			str_hour = "0" + hour;
		
		if (minute >= 10)
			str_minute = Integer.toString(minute);
		else
			str_minute = "0" + minute;
		
		if (second >= 10)
			str_second = Integer.toString(second);
		else
			str_second = "0" + second;
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
