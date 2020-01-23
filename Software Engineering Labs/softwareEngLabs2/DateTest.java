package softwareEngLabs2;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(20,10,2020);
		Date comparison = new Date(29,9,1996);
		
		// Testing Date.print()
		today.print(System.out);
		
		// Testing Date.getDay(), Date.getMonth(), Date.getYear(), and Date.diffInYears()
		System.out.println("The difference between "+ today.getDay()+"/"+today.getMonth()+"/"+today.getYear()+" and "+
				comparison.getDay()+"/"+comparison.getMonth()+"/"+comparison.getYear()+" is:\n"
				+today.diffInYears(comparison)+" years.");
	
	}

}
