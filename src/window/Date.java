package window;

public class Date {
	int day;
	int month;
	int year;
	public Date() {
	}
	
	public  Date(int day,int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
}
	
	public int getday() {
		return day;
	}
	public void setday(int date) {
		this.day = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

	public void setYear(int i) {
		
	}
	
	
	
	
	
	

}
