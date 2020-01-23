package softwareEngLabs;

public class Main1 {
	public static void main(String[] args) {
		Person w1 = new Person("aaa", 1, 2, 1991, "worker");
	
		Person w2 = new Person("bbb", 3, 4, 1993, "worker");
		
		Person w3 = new Person("ccc", 5, 6, 1995, "worker");
		
		Person b1 = new Person("ddd", 7, 8, 1997, "boss");
	
		b1.setWorker(new Person[10]);
		
		Person b2 = new Person("eee", 9, 10, 1999, "boss");
		
		b2.setWorker(new Person[10]);
		
		w1.setBoss(b1);
		
		
		w2.setBoss(b1);
		
		
		w3.setBoss(b1);
		
		b1.print(System.err);
		System.err.print("\n");
		
		b2.print(System.err);
		System.err.print("\n");
		
		w1.print(System.err);
		System.err.print("\n");
		
		w2.print(System.err);
		System.err.print("\n");
		
		w3.print(System.err);
		System.err.print("\n");
	}

}
