package org.hbrs.se1.ws21.uebung2;

import java.util.List;

public class MemberView {
    // Method dum prints returns all sotred Members objects in the list
    public void dumb(List<Member> liste){
        System.out.println("All saved Members will be shown on the console:");
        // print each Object in the list with toString Method
        for ( Member p : liste ) {
            System.out.println( p.toString()  );
        }
    }
}
