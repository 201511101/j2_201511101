package com.j2.w11;

public abstract class CaffeineBeverageWithHook {
  final void prepareRecipe() {
    brew();
    boilWater();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }
  
  abstract void brew();
  abstract void addCondiments();
  
  void boilWater() {
    System.out.println("Boiling water");
  }
  
  void pourInCup() {
    System.out.println("Pouring into Cup");
  }
  
  boolean customerWantsCondiments() {
    return true;
  }
}
