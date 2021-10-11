package org.hbrs.se1.ws21.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2021"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		String[] arrNumbers = {"eins", "zwei", "drei", "vier" , "fünf",
				               "sechs" , "sieben" , "acht" , "neun" , "zehn" };
		String text = "";

		// Je nach der Eingabe wird eine Zahl im schriftlichen Form zurückgeliefert.
		// Index fängt bei 0 in Arrays an, von daher ist eine -1 notwendig.
		// Falls eine ungültige Zahl eingegeben wurde, wird ein ArrayIndexOutOfBoundsException aufgelöst
		// und genau dann wird diese Exception geschnappt und die Fehler Nachricht zurückliefern.
		try{
			// String Zahl wird hier gespeichert
			text = arrNumbers[number - 1];
		} catch(ArrayIndexOutOfBoundsException e){
			// Die Fehlermeldung die zurückgeliefert wird
			System.out.println("Übersetzung der Zahl " + number + " nicht möglich " + "( Version " + version +" )");
		}
		return text;
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
