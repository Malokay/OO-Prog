package de.fh_mainz.oo_prog.U03;
import de.fh_mainz.oo_prog.util.*;
public class Sort_test {

	public static void main(String[] args) {
		int [] array =ArrayTools.zufzahlen();
		ArrayTools.ausgabe(array);
		array=ArrayTools.sort(array);
		System.out.println();
		ArrayTools.ausgabe(array);
	}

}
