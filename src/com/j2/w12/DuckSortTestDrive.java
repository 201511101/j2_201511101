package com.j2.w12;
import java.util.Arrays;

public class DuckSortTestDrive {
  public static void main (String[] args) {
    Duck[] ducks = {
      new Duck("a", 9),
      new Duck("b", 4),
      new Duck("c", 3),
      new Duck("d", 8),
      new Duck("e", 7)
    };
    
    Arrays.sort(ducks);
    
    Duck[] myDucks = {
      new Duck("Sang", 8),
      new Duck("Myung", 2),
      new Duck("Uni", 7)
    };
    
    Arrays.sort(myDucks, new DuckComparator());
    
  }
    
  public static void showArray(Duck[] ducks) {
    for (Duck d : ducks) {
      System.out.println(d);
    }
  }
  
}