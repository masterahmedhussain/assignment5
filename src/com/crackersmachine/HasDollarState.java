package com.crackersmachine;

public class HasDollarState implements CrackerState{
    CrackersMachine crackersMachine;

    public HasDollarState(CrackersMachine crackersMachine) {
        this.crackersMachine = crackersMachine;
    }

    public void insertDollar() {
        System.out.println("You can't insert another dollar");
    }

    public void ejectDollar() {
        System.out.println("Dollar returned");
        crackersMachine.setState(crackersMachine.getNoDollarState());
    }
    public void turnCrank() {
		System.out.println("You turned...");
		crackersMachine.setState(crackersMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No Cracker dispensed");
    }

    public void refill() { }

    public String toString() {
        return "waiting for turn of crank";
    }


}
