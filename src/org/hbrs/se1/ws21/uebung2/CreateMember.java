package org.hbrs.se1.ws21.uebung2;

public class CreateMember implements Member {
    Integer id;

    @Override
    public Integer getID() {
        return this.id;
    }

    public CreateMember( Integer id ){
        this.id = id;
    }


    public void setID ( Integer id ) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberKonkret [id=" + id + "]";
    }
}
