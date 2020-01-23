package softwareEngLabs2;

import java.io.PrintStream;

public class Date {
	private int day, month, year;
	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
// Calculates the difference between 2 given Date objects' years	
	public int diffInYears(Date compareWithThis) {
		int diff = 0;
		
		if(this.month>compareWithThis.getMonth())
			diff = this.year - compareWithThis.getYear();
		if(this.month<compareWithThis.getMonth())
			diff = (this.year - compareWithThis.getYear()) - 1;
		if(this.month==compareWithThis.getMonth())
			if(this.day>=compareWithThis.getDay()) 
				diff = this.year - compareWithThis.getYear();
			else
				diff = (this.year - compareWithThis.getYear()) - 1;
		
		return diff;
	}
	
// Print method for printing to user-specified PrintStream	
	public void print(PrintStream userStream) {
		userStream.println("Date: "+this.day+"/"+this.month+"/"+this.year);
	}
}
