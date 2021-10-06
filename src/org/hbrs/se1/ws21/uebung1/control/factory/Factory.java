package org.hbrs.se1.ws21.uebung1.control.factory;
import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;

public class Factory {
    public static GermanTranslator createGermanTranslator(){
        return new GermanTranslator();
    }
}
