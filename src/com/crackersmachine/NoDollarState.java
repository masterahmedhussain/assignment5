package com.crackersmachine;

public class NoDollarState implements CrackerState {
    CrackersMachine crackersMachine;


    public NoDollarState(CrackersMachine crackersMachine) {
        this.crackersMachine = crackersMachine;
    }
 
	public void insertDollar() {
		System.out.println("You inserted a dollar");
		crackersMachine.setState(crackersMachine.getHasDollarState());
	}
 
	public void ejectDollar() {
		System.out.println("You haven't inserted a dollar");
	}
 
    public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}
	public void dispense() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for Dollar";
	}
    
}
