package com.j2.w5;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza=null;
    if(type.equals("cheese")) {
      pizza=new CheesePizza();
    } else if(type.equals("Veggie")) {
      pizza= new VeggiePizza();
    }
    return pizza;
  }
}