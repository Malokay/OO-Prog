package de.fh_mainz.oo_prog.U01;

public class Dreieck_alternativ {

	private Punkt[] punkte;
	private double flaeche;
	private double umfang;

	public Dreieck_alternativ(Punkt[] punkte) {
		this.punkte = punkte;
		this.umfang();
		this.fleache();
	}

	public Dreieck_alternativ(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
		punkte = new Punkt[3];
		this.punkte[0] = punkt1;
		this.punkte[1] = punkt2;
		this.punkte[2] = punkt3;
		this.umfang();
		this.fleache();
	}

	private void umfang() {
		this.umfang = (punkte[0].entfernung(punkte[1])
				+ punkte[1].entfernung(punkte[2]) + punkte[2]
				.entfernung(punkte[0]));
	}

	private void fleache() {
		double s = this.umfang / 2;
		this.flaeche = Math.sqrt(s * (s - punkte[0].entfernung(punkte[1]))
				* (s - punkte[1].entfernung(punkte[2]))
				* (s - punkte[2].entfernung(punkte[0])));
	}

	public Punkt[] getPunkte() {
		return punkte;
	}

	public void setPunkte(Punkt[] punkte) {
		this.punkte = punkte;
		this.umfang();
		this.fleache();
	}

	public double getFlaeche() {
		return flaeche;
	}

	public double getUmfang() {
		return umfang;
	}

}