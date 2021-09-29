
package com.crackersmachine;

public class ContainsCoinState implements CrackerState{
    CrackerVendingMachine machine;
    public ContainsCoinState(CrackerVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
       System.out.println("Coin already inserted");
    }
    @Override
    public void pressButton() {
       machine.setState(machine.getDispensedState());
    }
    @Override
    public void dispense() {
       System.out.println("Press button to dispense");
    }
    @Override
    public String toString(){
        return "ContainsCoinState";
    }
}