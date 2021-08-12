package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private double x;
	private double y;

	public MyCalculator(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void plus() {
		System.out.println(x + y);

	}

	@Override
	public void minus() {
		System.out.println(x - y);

	}

	@Override
	public void multiply() {
		System.out.println(x * y);

	}

	@Override
	public void devide() {
		System.out.println(x / y);

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyCalculator [x=" + x + ", y=" + y + "]";
	}

}
