package de.oszimt.ls.quiz.model;

public class Schueler {

	// Anfang Attribute
	private String name;
	private int joker;
	private int blamiert;
	private int fragen;
	private boolean anwesend;
	// Ende Attribute

	/**
	 * Create Schüler
	 * 
	 * @param name
	 * @param joker
	 * @param blamiert
	 * @param fragen
	 */
	public Schueler(String name, int joker, int blamiert, int fragen) {
		this.name = name;
		this.joker = joker;
		this.blamiert = blamiert;
		this.fragen = fragen;
		this.anwesend = true;
	}

	// Anfang Methoden
	public String getName() {
		return name;
	}

	public boolean isAnwesend() {
		return this.anwesend;
	}

	public int getJoker() {
		return joker;
	}

	public int getBlamiert() {
		return blamiert;
	}

	public int getFragen() {
		return fragen;
	}

	public void blamiert() {
		this.blamiert++;
	}

	public void gefragt() {
		this.fragen++;
	}

	public void nichtDa() {
		this.fragen--;
		this.anwesend = false;
	}

	public void jokerEingesetzt() {
		this.joker++;
	}
	// Ende Methoden
}
