package de.fh_mainz.oo_prog.U02;

public class Person {
	private String nachname,vorname,geschlecht;
	private int alter;
	
	public Person(){
		this.nachname="";
		this.vorname="";
		this.geschlecht="";
		this.alter=0;
	}
	
	
	
	public boolean vergleich(Person other){
		if(other.nachname==this.nachname&&other.alter==this.alter){
			return true;
		}
		if(other.vorname==this.vorname&&other.alter==this.alter){
			return true;
		}		
		return false;
	}

	@Override
	public String toString() {
		return "Person [nachname=" + nachname + ", vorname=" + vorname
				+ ", geschlecht=" + geschlecht + ", alter=" + alter + "]";
	}
	
}
