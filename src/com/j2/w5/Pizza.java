package com.j2.w5;

abstract public class Pizza {
  String name;
  public void prepare() {
    System.out.println("Preparing "+name);
  }
  public void bake() {
    System.out.println("Baking "+name);
  }
  public void cut() {
    System.out.println("Cutting "+name);
  }
  public void box() {
    System.out.println("Boxing "+name);
  }
  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    return display.toString();
  }
}


