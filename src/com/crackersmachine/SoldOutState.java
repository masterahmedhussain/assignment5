package com.crackersmachine;

public class SoldOutState implements CrackerState {
    CrackersMachine crackersMachine;
 
    public SoldOutState(CrackersMachine crackersMachine) {
        this.crackersMachine = crackersMachine;
    }
 
	public void insertDollar() {
		System.out.println("You can't insert a dollar, the machine is sold out");
	}
 
	public void ejectDollar() {
		System.out.println("You can't eject, you haven't inserted a dollar yet");
	}
    public void turnCrank() {
		System.out.println("You turned, but there are no crackers");
	}
	public void dispense() {
		System.out.println("No Cracker dispensed");
	}
	
	public void refill() { 
		crackersMachine.setState(crackersMachine.getNoDollarState());
	}
 
	public String toString() {
		return "sold out";
	}
}
    
