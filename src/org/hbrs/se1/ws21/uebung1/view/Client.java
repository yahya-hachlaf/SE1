package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.hbrs.se1.ws21.uebung1.control.factories.TranslateFactory;

public class Client {
	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		//
		// Strenge Implementierung gegen das Interface Translator gewuenscht!
		// Design Pattern: Factory Method
		Translator translator = TranslateFactory.createGermanTranslator();
		String result = translator.translateNumber(aNumber);

		if (result.equals("")){
			System.out.println("Berechnung wird abgebrochen");
		} else {
			System.out.println("Das Ergebnis der Berechnung: " + result  );
		}
	}
	public static void main (String[] args){
		Client client = new Client();
		client.display(11);
	}

}




