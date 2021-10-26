package org.hbrs.se1.ws21.uebung3.persistence;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersistenceStrategyStream<Member> implements PersistenceStrategy<Member> {

    // URL of file, in which the objects are stored
    private String location = "objects.ser";

    // Backdoor method used only for testing purposes, if the location should be changed in a Unit-Test
    // Example: Location is a directory (Streams do not like directories, so try this out ;-)!
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    /**
     * Method for opening the connection to a stream (here: Input- and Output-Stream)
     * In case of having problems while opening the streams, leave the code in methods load
     * and save
     */
    public void openConnection() throws PersistenceException {

    }

    @Override
    /**
     * Method for closing the connections to a stream
     */
    public void closeConnection() throws PersistenceException {

    }

    @Override
    /**
     * Method for saving a list of Member-objects to a disk (HDD)
     */
    public  void save(List<Member> member) throws PersistenceException  {

    }

    @Override
    /**
     * Method for loading a list of Member-objects from a disk (HDD)
     * Some coding examples come for free :-)
     * Take also a look at the import statements above ;-!
     */
    public  List<Member> load() throws PersistenceException {
        // Some Coding hints ;-)
        // ObjectInputStream ois = null;
        // FileInputStream fis = null;
        // List<...> newListe =  null;
        //
        // Initiating the Stream (can also be moved to method openConnection()... ;-)
        // fis = new FileInputStream( " a location to a file" );
        // ois = new ObjectInputStream(fis);

        // Reading and extracting the list (try .. catch ommitted here)
        // Object obj = ois.readObject();

        // if (obj instanceof List<?>) {
        //       newListe = (List) obj;
        // return newListe

        // and finally close the streams (guess where this could be...?)

        // with fis input will be obtained from the file
        // with ois ensures that the types of all objects in the graph created from the stream
        // match the classes present in the Java Virtual Machine.
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        List<Member> newListe = null;

        try {
            fis = new FileInputStream(PersistenceStrategyStream.this.location);
            ois = new ObjectInputStream(fis);

            // Read the file
            Object obj = ois.readObject();

            // pass the obj to newList of they belong to the same Object Typ
            if (obj instanceof List<?>) {
                newListe = (List) obj;
            }

            System.out.println("The Members" + newListe.size() + " have been successfully loaded!");

            return newListe;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: List couldn't be extracted!");
        } finally {
            if (ois != null) try { ois.close(); } catch (IOException e) {}
            if (fis != null) try { fis.close(); } catch (IOException e) {}
        }
        return newListe;
    }
}
