package softwareEngLabs2;

public class LOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOP personList = new LOP();

		Person joe = new Person("Joe",(new Date(12,1,1990)));
		Person carole = new Person("Carole",(new Date(23,7,1932)));
		Person samantha = new Person("Samantha", (new Date(30,11,2032)));
		
		personList.add(joe);
		personList.add(carole);
		personList.add(samantha);
		
		System.out.println("\nFull list of people:");
		personList.print(System.out);
		
		System.out.println("\nFind Joe:");
		System.out.println(personList.find("Joe").getName());
		
		personList.remove(carole);
		
		System.out.println("\nList sans Carole:");
		personList.print(System.out);
		
		
		
	}

}
