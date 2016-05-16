package com.j2.w11;
import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.println("Brewing Tea");
  }
  
  public void addCondiments() {
    System.out.println("Add lemon");
  }
    
  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    
    if(answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }
  
  private String getUserInput() {
    String answer = null;
    System.out.println("Lemon?");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("ERROR");
    }
    
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
