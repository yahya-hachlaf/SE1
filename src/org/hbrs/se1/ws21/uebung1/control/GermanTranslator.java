package org.hbrs.se1.ws21.uebung1.control;

import java.util.HashMap;

public class GermanTranslator implements Translator {

	public String date = "Okt/2021"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		final HashMap<Integer,String> numbers = new HashMap<>();

		numbers.put(0,"");
		numbers.put(1,"Eins");
		numbers.put(2,"Zwei");
		numbers.put(3,"Drei");
		numbers.put(4,"Vier");
		numbers.put(5,"Fünf");
		numbers.put(6,"Sechs");
		numbers.put(7,"Sieben");
		numbers.put(8,"Acht");
		numbers.put(9,"Neun");
		numbers.put(10,"Zehn");


		return numbers.get(number);
	}
		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2021))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
