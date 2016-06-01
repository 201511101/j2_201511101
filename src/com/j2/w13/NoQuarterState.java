package com.j2.w13;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;
  
  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Qurater Inserted.");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter.");
  }
  
  public void turnCrank() {
    System.out.println("No Quarter.");
  }
  
  public void dispense() {
    System.out.println("You need to pay first.");
  }
}
