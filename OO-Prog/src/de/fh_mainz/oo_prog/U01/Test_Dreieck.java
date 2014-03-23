package de.fh_mainz.oo_prog.U01;
import de.fh_mainz.oo_prog.util.Tastatur;



public class Test_Dreieck {

	public static void main(String[] args) {

		// TODO Auto-generated method stub		
		
		Dreieck dreieck;
		Punkt[] punkte = new Punkt[3];

		for (int i = 0; i < punkte.length; i++) {
			Punkt neu = new Punkt();
			System.out.println("Geben sie die Koordinaten des "+(i+1)+"-ten Punktes ein");
			neu.setX(Tastatur.readdouble("Bitte x eingeben eingeben: "));
			neu.setY(Tastatur.readdouble("Bitte y eingeben eingeben: "));
			punkte[i] = neu;
		}

		dreieck = new Dreieck(punkte);
		System.out.printf("Umfang des Dreiecks: %.3f\n", dreieck.umfang());
		System.out.printf("Flaeche des Dreiecks: %.3f", dreieck.fleache());
	}

}
