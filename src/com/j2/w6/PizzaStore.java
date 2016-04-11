package com.j2.w6;

/*
public class PizzaStore {
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza=factory.createPizza(type);
    Pizza.prepare();
  }
}
*/

public abstract class PizzaStore {
  abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type) {
    Pizza pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}

