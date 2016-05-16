package com.j2.w11;

public class Barista {
  public static void main(String[] args) {
    Tea tea = new Tea();
    tea.prepareRecipe();
    Coffee coffee = new Coffee();
    coffee.prepareRecipe();
  }
}

