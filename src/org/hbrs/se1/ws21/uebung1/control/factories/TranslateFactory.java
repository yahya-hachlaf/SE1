package org.hbrs.se1.ws21.uebung1.control.factories;

import org.hbrs.se1.ws21.uebung1.control.*;
import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
/*
Die Klasse Factory dient dazu, mit Hilfe einer Methode createGermanTranslator,
um eine Instanz von der Klasse GermanTranslator zu erzeugen und zurückliefern.
 */
public class TranslateFactory {
    // Die statische Methode createGermanTranslator, die ein neuer Instanz GermanTranslator von Typ Translator als Rückgabe hat.
    public static Translator createGermanTranslator(){
        return new GermanTranslator();
    }
}
