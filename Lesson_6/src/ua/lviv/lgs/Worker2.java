package ua.lviv.lgs;

public class Worker2 implements Salary {
	double salary; 
	
	
	public Worker2(double salary) {
		super();
		this.salary = salary;
	}
	
	public void salary() {
		System.out.println("«арплата к≥нц≥ м≥с€ц€ " + salary);
	}

}
