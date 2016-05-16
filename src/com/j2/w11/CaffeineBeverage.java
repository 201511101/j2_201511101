package com.j2.w11;

public abstract class CaffeineBeverage {
  final void prepareRecipe() {
    brew();
    addCondiments();
    boilWater();
    pourInCup();
  }
  
  abstract void brew();
  abstract void addCondiments();
  
  void boilWater() {
    System.out.println("Boiling water");
  }
  
  void pourInCup() {
    System.out.println("Pouring into Cup");
  }
}
