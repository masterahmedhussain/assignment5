package com.crackersmachine;


public class NoCrackerState implements CrackerState{
    CrackerVendingMachine machine;
    public NoCrackerState(CrackerVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
     System.out.println("No Cracker available");
    }
    @Override
    public void pressButton() {
        System.out.println("No Cracker available");
    }
    @Override
    public void dispense() {
        System.out.println("No Cracker available");
    }
    @Override
    public String toString(){
        return "NoCrackerState";
    }
}
