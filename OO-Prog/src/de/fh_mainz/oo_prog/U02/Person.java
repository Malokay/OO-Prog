package de.fh_mainz.oo_prog.U02;

public class Person {
	private String nachname, vorname;
	private boolean geschlecht;
	private int alter;

	public Person() {
		this.nachname = "";
		this.vorname = "";
		this.geschlecht = true;
		this.alter = 0;
	}

	/**
	 * @param nachname
	 * @param vorname
	 * @param geschlecht
	 *            m/w
	 * @param alter
	 */
	public Person(String nachname, String vorname, String geschlecht, int alter) {
		this.nachname = nachname;
		this.vorname = vorname;
		if (geschlecht.equals("w"))
			this.geschlecht = false;
		else
			this.geschlecht = true;
		this.alter = alter;
	}

	public boolean equals(Person other) {

		try {
			if (((other.nachname.equals(this.nachname) && other.alter == this.alter))
					&& ((other.vorname.equals(this.vorname) && other.alter == this.alter))) {
				return true;
			}

			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return false;
		}

	}

	@Override
	public String toString() {
		return "Person [nachname=" + nachname + ", vorname=" + vorname
				+ ", geschlecht=" + geschlecht + ", alter=" + alter + "]";
	}

}
