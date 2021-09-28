package com.crackersmachine;

public class CrackersMachine {
    CrackerState soldOutState;
	CrackerState noDollarState;
	CrackerState hasDollarState;
	CrackerState soldState;
 
	CrackerState crackerState;
	int count = 0;
 
	public CrackersMachine(int numberOfCrackers) {
		soldOutState = new SoldOutState(this);
		noDollarState = new NoDollarState(this);
		hasDollarState = new HasDollarState(this);
		soldState = new SoldState(this);

		this.count = numberOfCrackers;
 		if (numberOfCrackers > 0) {
			crackerState = noDollarState;
		} else {
			crackerState = soldOutState;
		}
	}
 
	public void insertQuarter() {
		crackerState.insertDollar();
	}
 
	public void ejectQuarter() {
		crackerState.ejectDollar();
	}
 
	public void turnCrank() {
        crackerState.turnCrank();
		crackerState.dispense();
	}
 
	void releaseBall() {
		System.out.println("A cracker comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The cracker machine was just refilled; its new count is: " + this.count);
		crackerState.refill();
	}

	void setState(CrackerState crackerState) {
		this.crackerState = crackerState;
	}
    public CrackerState getState() {
        return crackerState;
    }

    public CrackerState getSoldOutState() {
        return soldOutState;
    }

    public CrackerState getNoDollarState() {
        return noDollarState;
    }

    public CrackerState getHasDollarState() {
        return hasDollarState;
    }

    public CrackerState getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n Ritz Crackers");
		result.append("\nInventory: " + count + " crackers");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + crackerState + "\n");
		return result.toString();
	}
}
