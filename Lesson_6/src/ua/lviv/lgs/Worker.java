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
		System.out.println("�������� � ��������� ������� � ���� ����� " + x * hours * day);

	}

}
