package softwareEngLabs;

import java.io.PrintStream;


public class Person {
	private String name;
	private int dob_d, dob_m, dob_y; // date of birth
	private int type; // 1 = Boss, 2 = Worker
	private Person boss;
	private Person[] worker;
	private int nworkers;

	public Person(String n, int d, int m, int y, String t) {
		name = n;
		dob_d = d;
		dob_m = m;
		dob_y = y;
		setType(t);
		boss = null;
		worker = null;
		nworkers = 0;
	}

	public void print(PrintStream ps) {
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
		if (type == 1) {
			ps.print(" bosses: ");
			for (int i = 0; i < nworkers; i++)
				ps.print(worker[i].name + " ");
		} else
			ps.print(" is bossed by " + boss.name);
	}
	
	public void setWorker(Person[] worker) {
		this.worker = worker;
	}
	
	public Person[] getWorker() {
		return worker;
	}

	public int getNWorkers() {
		return nworkers;
	}

	public void setBoss(Person boss) {
		this.boss = boss;
		boss.addWorker(this);
	}
	
	public void addWorker(Person newWorker) {
		this.worker[nworkers] = newWorker;
		nworkers++;
	}
	
	public void setType(String t) {
		if (t.equals("boss")) {
			this.type = 1;
		}
		else 
			this.type = 2;
	}

	
}
