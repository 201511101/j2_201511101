package com.j2.w13;

public class SoldState implements State {
  GumballMachine gumballMachine;
  
  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Wait. We have already given a gumball.");
  }
  
  public void ejectQuarter() {
    System.out.println("Wait...");
  }
  
  public void turnCrank() {
    System.out.println("Wait...");
  }
  
  public void dispense() {
    if (gumballMachine.getCount() > 0) {
      System.out.println("Gumball Release");
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("SOLD OUT");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}
