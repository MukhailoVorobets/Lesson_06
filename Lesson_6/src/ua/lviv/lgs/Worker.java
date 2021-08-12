package ua.lviv.lgs;

public class Worker implements Salary {
	double x;
	int hours;
	int day;
	

	public Worker(double x, int hours, int day) {
		super();
		this.x = x;
		this.hours = hours;
		this.day = day;
	}


	public void salary() {
		System.out.println("«арплата з погодиною оплатою в к≥нц≥ м≥с€ц€ " + x * hours * day);

	}

}
