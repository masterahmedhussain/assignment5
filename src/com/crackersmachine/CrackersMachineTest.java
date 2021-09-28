package com.crackersmachine;

public class CrackersMachineTest {

    public static void main(String[] args) {
		CrackersMachine CrakersMachine = new CrackersMachine(10);

		System.out.println(CrakersMachine);

		CrakersMachine.insertQuarter();
		CrakersMachine.turnCrank();

		System.out.println(CrakersMachine);

		CrakersMachine.insertQuarter();
		CrakersMachine.turnCrank();
		CrakersMachine.insertQuarter();
		CrakersMachine.turnCrank();
		
		CrakersMachine.refill(5);
		CrakersMachine.insertQuarter();
		CrakersMachine.turnCrank();

		System.out.println(CrakersMachine);
	}
    
}
