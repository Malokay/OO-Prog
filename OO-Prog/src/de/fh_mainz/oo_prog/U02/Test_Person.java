package de.fh_mainz.oo_prog.U02;

import de.fh_mainz.oo_prog.util.Tastatur;

public class Test_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vorhanden = false;

		Person[] personen = new Person[0];
		do {
			String nachname = Tastatur.inputString("Nachname: ");
			String vorname = Tastatur.inputString("Vorname: ");
			String geschlecht = Tastatur.inputString("Geschlecht (w/m) :");
			int alter = Tastatur.inputint("Alter: ");

			Person neuerDat = new Person(nachname, vorname, geschlecht, alter);
			
			for (int k = 0; k < personen.length; k++) {
				if (neuerDat.equals(personen[k])) {
					personen[k] = neuerDat;
					vorhanden = true;
				}
			}
			if (vorhanden == true) {
				vorhanden = false;

			} else{
				personen=erweitern(personen);
				personen[personen.length-1] = neuerDat;
				
			}
		} while(Tastatur.inputchar("Weitere Daten einlesen: (j/n)")=='j'); 
		for (int i = 0; i < personen.length; i++) {
			System.out.println(personen[i].toString());
		}

	}
	public static Person[] erweitern(Person[] old){
		Person[] temp = new Person[old.length];
		for(int i =0;i<old.length;i++){
			temp[i]=old[i];
		}
		old=new Person[temp.length+1];
		for(int i=0;i<temp.length;i++){
			old[i]=temp[i];
		}
		return old;
	}
}
