package de.fh_mainz.oo_prog.U01;

public class Dreieck {

	private Punkt[] punkte; 

	public Dreieck(Punkt[] punkte) {
		this.punkte = punkte;
	}

	public Dreieck(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
		punkte= new Punkt[3];
		this.punkte[0] = punkt1;
		this.punkte[1] = punkt2;
		this.punkte[2] = punkt3;
	}

	public double umfang() {
		return (punkte[0].entfernung(punkte[1])
				+ punkte[1].entfernung(punkte[2])
				+ punkte[2].entfernung(punkte[0]));
	}

	public double fleache() {
		double s = umfang() / 2;
		return Math.sqrt(s * (s - punkte[0].entfernung(punkte[1]))
				* (s - punkte[1].entfernung(punkte[2]))
				* (s - punkte[2].entfernung(punkte[0])));
	}

	public Punkt[] getPunkte() {
		return punkte;
	}

	public void setPunkte(Punkt[] punkte) {
		this.punkte = punkte;
	}
}