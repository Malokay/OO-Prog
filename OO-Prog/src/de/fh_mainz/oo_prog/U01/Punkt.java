package de.fh_mainz.oo_prog.U01;

public class Punkt {

	private double x;
	private double y;
	public static double PI = 3.14159265;

	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punkt() {
		this.x = 0;
		this.y = 0;
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

	public double entfernung(Punkt other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2)
				+ Math.pow(this.y - other.y, 2));
	}

}
