package com.crackersmachine;


public class NoCoinState implements CrackerState {
    CrackerVendingMachine machine;
    public NoCoinState(CrackerVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
      machine.setState(machine.getContainsCoinState());
    }
    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }
    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }
    @Override
    public String toString(){
        return "NoCoinState";
    }
}
