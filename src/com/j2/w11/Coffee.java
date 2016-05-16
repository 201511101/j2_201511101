package com.j2.w11;

public class Coffee {
  void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  
  public void boilWater() {
    System.out.println("Boiling Water");
  }
  
  public void brewCoffeeGrinds() {
    System.out.println("Brewing Coffee");
  }
  
  public void pourInCup() {
    System.out.println("Pouring in Cup");
  }
  
  public void addSugarAndMilk() {
    System.out.println("Add Sugar and Milk");
  }
}

