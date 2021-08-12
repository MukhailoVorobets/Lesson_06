package ua.lviv.lgs;

public class main {

	public static void main(String[] args) {
		Worker w = new Worker(12.2, 8, 20);
		Worker2 w2 = new Worker2(5000.5);
		w.salary();
		w2.salary();
		Salary s = new Worker(11.3, 8, 20);
		Salary s2 = new Worker2(2000.2);
		s.salary();
		s2.salary();

	}

}
