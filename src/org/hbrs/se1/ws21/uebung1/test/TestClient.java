package org.hbrs.se1.ws21.uebung1.test;

import org.hbrs.se1.ws21.uebung1.view.Client;

public class TestClient {

    //Deklaration einer final Instanz Client
    private final Client client;

    // Konstrator erzeugt auch eine neue Client-Instanz bei der Erzeugung von Instanz der Typ TestClient
    public TestClient(){
        client = new Client();
    }
    // Test Methode, die alle positive und negative Tests durchführt.
    public void test(){
        client.display( 5 );
        client.display ( 12 );
        client.display ( -15 );
        client.display ( 0 );
    }
    public static void main (String[] args) {
        TestClient obj = new TestClient();
        obj.test();
    }
}
