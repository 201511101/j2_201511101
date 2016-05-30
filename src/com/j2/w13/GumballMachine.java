package com.j2.w13;

public class GumballMachine {
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 0;
  final static int HAS_QUARTER = 0;
  final static int SOLD = 0;
  
  int state = SOLD_OUT;
  int count=0;
  
  public GumballMachine(int count) {
    this.count = count;
    if (count>0) {
      state = NO_QUARTER;
    }
  }
  
  public void insertQuarter() {
    if(state == HAS_QUARTER) {
      System.out.println("You can not insert another quarter");
    }
    else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("You inserted another quarter");
    }
    else if (state == SOLD_OUT) {
      System.out.println("you can note insert, SOLD OUT");
    }
    else if (state == SOLD) {
      System.out.println("Wait. We have already given a gumball");
    }
  }
  
  public void ejectQuarter() {
    if(state == HAS_QUARTER) {
      state = NO_QUARTER;
      System.out.println("Quarter Returned.");
    }
    else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("You haven't inserted a quarter.");
    }
    else if (state == SOLD_OUT) {
      System.out.println("SOLD OUT");
    }
    else if (state == SOLD) {
      System.out.println("Wait...");
    }
  }
    
  public void turnCrank() {
    if(state == HAS_QUARTER) {
      state = SOLD;
      dispense();
      System.out.println("Dispensing...");
    }
    else if (state == NO_QUARTER) {
      System.out.println("No Quarter.");
    }
    else if (state == SOLD_OUT) {
      System.out.println("SOLD OUT");
    }
    else if (state == SOLD) {
      System.out.println("Wait...");
    }
  }
    
  public void dispense() {
    if(state == HAS_QUARTER) {
      System.out.println("Gumball Dispensing...");
    }
    else if (state == NO_QUARTER) {
      System.out.println("You need to pay first.");
    }
    else if (state == SOLD_OUT) {
      System.out.println("SOLD OUT");
    }
    else if (state == SOLD) {
      System.out.println("Gumball!");
      count = count -1;
      if (count == 0) {
        System.out.println("SOLD OUT");
        state = SOLD_OUT;
      }
      else {
        state = NO_QUARTER;
      }
    }
  }
  
}
