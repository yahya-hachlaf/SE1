package org.hbrs.se1.ws21.uebung2;

public class ContainerException extends Exception {
    Integer id;

    @Override
    // printStackTrace() Method from the class Throwable
    public void printStackTrace() {
        System.out.println("„Das Member-Objekt mit der ID " + id + " ist bereits vorhanden!");
    }

    // Method addID saves the id parameter in the local Variable id
    public void addID(Integer id) {
        this.id = id;
    }
}
