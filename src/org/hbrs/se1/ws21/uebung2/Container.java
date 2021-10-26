package org.hbrs.se1.ws21.uebung2;

import java.util.ArrayList;

public class Container {

    // Arraylist list which contains only Member objects
    private static ArrayList<Member> list = new ArrayList<>();

    /* CR 1: Singleton Design Pattern is a good solution for this CR
    * in which we can ensure that only signle instance should be created
    * and single object can be used by all other classes  */

    // a static class variable holds only one instance of the Container class
    private static Container obj;

    // Container() prevents the instantiation from any other class
    private Container(){}

    // getInstance() provides a global point of access
    private static Container getInstance(){
        if(obj == null){
            // synchronized block allows only one Threat to access and modify the object
            // and prevents other threat from a parallel access
            synchronized (Container.class){
                if(obj==null){
                    obj = new Container(); // instance will be created at request time
                }
            }
        }
        return obj;
    }

    // Method addMember adds Member to the list
    public void addMember( Member member) throws ContainerException {
        // if the Member already exist in the list an Exception will
        // be thrown and a message that contains the given id will be displayed
        // with the help of the printStackTrace Method
        if (contains(member) == true){
            ContainerException ce = new ContainerException();
            ce.addID(member.getID());
            throw ce;
        }
        //else the member will be added
        list.add(member);
    }

    // Method contains checks if a given Member exists in the list
    public boolean contains (Member m){
        // Foreach Loop: go through all the Members of the list
        for(Member test : list ){
            // Check if the ID in intValue() are the same
            if (test.getID().intValue() == m.getID().intValue()){
                return true;
            }
        }
        return false;
    }

    // Methode deleteMember deletes the Member from the list
    public String deleteMember( Integer id){
        // check if the member firts exists
        Member m = getMember(id);
        if (m == null){
            return "There is no Member with this id";
        } else{
            // delete the member and return a msg
            list.remove(m);
            return "The Member with the id" + id + "has been deleted!";
        }
    }

    // Method dum prints returns all sotred Members objects in the list
    public void dumb(){
        System.out.println("All saved Members will be shown on the console:");
        // print each Object in the list with toString Method
        for ( Member p : list ) {
            System.out.println( p.toString()  );
        }
    }

    // Methode size returns the size of the list
    public int size(){
        return list.size();
    }

    private Member getMember(Integer id) {
        // Foreach Loop: go through all the Members of the list
        for ( Member m : list) {
            // if the Member id value matches the given id return the member
            if (id == m.getID().intValue() ){
                return m;
            }
        }
        return null;
    }

    // Store Methode stores the added Member Objects of a Countainer Object presistent in a Data Storage
    private void store() throws PresistenceException{

    }

    // Load Methode loads the Member Objects after a restart
    private void load() throws PresistenceException{

    }

}
