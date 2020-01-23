package softwareEngLabs2;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date joeBDay = new Date(12,1,1990);
		Date today = new Date(23,1,2020);
		Person joe = new Person("Joe", joeBDay);
		
		// Testing Person.print()
		joe.print(System.out);
		
		// Tests Person.getName() and Person.getAge()
		System.out.println(joe.getName()+" is "+joe.getAge(today));
		

	}

}
