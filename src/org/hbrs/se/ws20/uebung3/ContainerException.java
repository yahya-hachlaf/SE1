package org.hbrs.se.ws20.uebung3;

public class ContainerException extends Exception {
	
	private String modus;
	private Integer id;
	private ExceptionType type;
	
	public ContainerException( ExceptionType type  ) {
		this.type = type;
	}
 
	@Override
	public void printStackTrace() {
		
		if ( this.type == ExceptionType.DuplicateMember ) { 
			
			System.out.println("Das Member-Objekt mit der ID " + this.id + " ist bereits vorhanden!");
			
		} else if ( this.type == ExceptionType.InfoCastException ) {
			
		    System.out.println("Das Member-Objekt mit der ID " + this.id + " konnte nicht gecastet werden!");			
			
		} 
	} 

	public void addID(Integer id) {
		this.id = id;
	}
	
	enum ExceptionType {
		InfoCastException, DuplicateMember
	}


}
