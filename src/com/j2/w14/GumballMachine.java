package com.j2.w14;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
  // final static int SOLD_OUT = 0;
  State soldOutState;
  // final static int NO_QUARTER = 1;
  State noQuarterState;
  // final static int HAS_QUARTER = 2;
  State hasQuarterState;
  // final static int SOLD = 3;
  State soldState;
  
  // int state = SOLD_OUT;
  State state;
  int count=0;
  String location;
  
  public GumballMachine(String location, int numberGumballs) throws RemoteException {
    SoldOutState soldOutState = new SoldOutState(this);
    NoQuarterState noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.count = numberGumballs;
    this.location = location;
    if (numberGumballs > 0) {
      // state = NO_QUARTER;
      state = noQuarterState;
    }
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public State getSoldOutState() {
    return soldOutState;
  }
 
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }
  
  public int getCount() {
    return count;
  }
  
  public State getState() {
    return state;
  }
  
  public String getLocation() {
    return location;
  }
  
  public void insertQuarter() {
    //if(state == HAS_QUARTER) {
    //  System.out.println("You can not insert another quarter");
    //}
    //else if (state == NO_QUARTER) {
    //  state = HAS_QUARTER;
    //  System.out.println("You inserted another quarter");
    //}
    //else if (state == SOLD_OUT) {
    //  System.out.println("you can not insert, SOLD OUT");
    //}
    //else if (state == SOLD) {
    //  System.out.println("Wait. We have already given a gumball");
    //}
  //}
    state.insertQuarter();
  }
  
  public void ejectQuarter() {
    //if(state == HAS_QUARTER) {
    //  state = NO_QUARTER;
    //  System.out.println("Quarter Returned.");
    //}
    //else if (state == NO_QUARTER) {
    //  state = HAS_QUARTER;
    //  System.out.println("You haven't inserted a quarter.");
    //}
    //else if (state == SOLD_OUT) {
    //  System.out.println("SOLD OUT");
    //}
    //else if (state == SOLD) {
    //  System.out.println("Wait...");
    //}
  //}
    state.ejectQuarter();
  }
    
  public void turnCrank() {
    //if(state == HAS_QUARTER) {
    //  state = SOLD;
    //  dispense();
    //  System.out.println("Dispensing...");
    //}
    //else if (state == NO_QUARTER) {
    //  System.out.println("No Quarter.");
    //}
    //else if (state == SOLD_OUT) {
    //  System.out.println("SOLD OUT");
    //}
    //else if (state == SOLD) {
    //  System.out.println("Wait...");
    //}
  //}
    state.turnCrank();
  }
    
  public void dispense() {
    //if(state == HAS_QUARTER) {
    //  System.out.println("Gumball Dispensing...");
    //}
    //else if (state == NO_QUARTER) {
    //  System.out.println("You need to pay first.");
    //}
    //else if (state == SOLD_OUT) {
    //  System.out.println("SOLD OUT");
    //}
    //else if (state == SOLD) {
    //  System.out.println("Gumball!");
    //  count = count -1;
    //  if (count == 0) {
    //    System.out.println("SOLD OUT");
    //    state = SOLD_OUT;
    //  }
    //  else {
    //    state = NO_QUARTER;
    //  }
   // }
 // }
    state.dispense();
  }
}
