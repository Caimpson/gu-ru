package softwareEngLabs2;

import java.io.PrintStream;
import java.util.ArrayList;

public class LOP {
	private ArrayList<Person> listOfPeople;
	
	public LOP() {
		this.listOfPeople = new ArrayList<Person>();
	}
	
	public void add(Person newMember) {
		listOfPeople.add(newMember);
	}
	
	public void remove(Person removeFromList) {
		listOfPeople.remove(removeFromList);
	}
	
	public Person find(String nameOfPersonToFind) {
		for(int i = 0;i < listOfPeople.size();i++) {
			if(listOfPeople.get(i).getName().equals(nameOfPersonToFind))
				return listOfPeople.get(i);
		}
		return null;
	}
	
	public void print(PrintStream userStream) {
		for(int i = 0;i < listOfPeople.size();i++)
			userStream.println(listOfPeople.get(i).getName());
	}
}
