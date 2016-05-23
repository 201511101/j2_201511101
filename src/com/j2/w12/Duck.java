package com.j2.w12;

public class Duck implements Comparable {
  String name;
  int weight;
  int result;
  
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  
  public int compareTo(Object object) {
    Duck otherDuck = (Duck)object;
    if (this.weight<otherDuck.weight) {
      result = -1;
    } else if (this.weight == otherDuck.weight) {
      result = 0;
    } else {
      result = 1;
    }
    return result;
  }
}
