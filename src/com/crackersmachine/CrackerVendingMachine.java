package com.crackersmachine;

public class CrackerVendingMachine {
    CrackerState noCoinState;
    CrackerState noCrackerState;
    CrackerState dispensedState;
    CrackerState containsCoinState;
    CrackerState state;
    int count;
    public CrackerVendingMachine(int numberOfCracker){
        count = numberOfCracker;
        noCoinState = new NoCoinState(this);
        noCrackerState = new NoCrackerState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        state = noCoinState;
    }
    public void refillCracker(int count){
        this.count+=count;
        this.state=noCoinState;
    }
    public void ejectCracker(){
        if(count!=0){
            count--;
        }
    }
    public void insertCoin(){
        System.out.println("You inserted a coin.");
        state.insertCoin();
    }
    public void pressButton(){
        System.out.println("You have pressed the button.");
        state.pressButton();
        state.dispense();
    }
    public CrackerState getNoCrackerState() {
        return noCrackerState;
    }
    public void setNoCrackerState(CrackerState noCrackerState) {
        this.noCrackerState = noCrackerState;
    }
    public CrackerState getNoCoinState() {
        return noCoinState;
    }
    public void setNoCoinState(CrackerState noCoinState) {
        this.noCoinState = noCoinState;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public CrackerState getState() {
        return state;
    }
    public void setState(CrackerState state) {
        this.state = state;
    }
    public CrackerState getContainsCoinState() {
        return containsCoinState;
    }
    public void setContainsCoinState(CrackerState containsCoinState) {
        this.containsCoinState = containsCoinState;
    }
    public CrackerState getDispensedState() {
        return dispensedState;
    }
    public void setDispensedState(CrackerState dispensedState) {
        this.dispensedState = dispensedState;
    }
    @Override
    public String toString(){
        String machineDef="Current state of machine "+state +". Cracker available "+count;
        return machineDef;
    }
}
