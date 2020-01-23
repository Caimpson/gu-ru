package softwareEngLabs2;

import java.io.PrintStream;

public class Person {
	private String name;
	private Date dateOfBirth;
	public Person(String n, Date dob) {
		this.name = n;
		this.dateOfBirth = dob;
	}
	
	public void print(PrintStream userStream) {
		userStream.println("Name: "+this.name+"\nDoB: "+this.dateOfBirth.getDay()+"/"+this.dateOfBirth.getMonth()+"/"+this.dateOfBirth.getYear());
	}

	public String getName() {
		return name;
	}

	public int getAge(Date currentDate) {
		int age = currentDate.diffInYears(this.dateOfBirth);		
		return age;
	}

}
