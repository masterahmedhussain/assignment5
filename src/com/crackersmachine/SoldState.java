package com.crackersmachine;

public class SoldState implements CrackerState {

     
    CrackersMachine crackersMachine;
 
    public SoldState(CrackersMachine crackersMachine) {
        this.crackersMachine = crackersMachine;
    }
       
	public void insertDollar() {
		System.out.println("Please wait, we're already giving you a cracker");
	}
 
	public void ejectDollar() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another cracker!");
	}
 
	public void dispense() {
		crackersMachine.releaseBall();
		if (crackersMachine.getCount() > 0) {
			crackersMachine.setState(crackersMachine.getNoDollarState());
		} else {
			System.out.println("Oops, out of crackers!");
			crackersMachine.setState(crackersMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing a cracker";
	}
}
    

