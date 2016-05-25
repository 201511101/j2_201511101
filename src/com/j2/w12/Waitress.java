package com.j2.w12;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  
  public Waitress(PancakeHouseMenu p, DinerMenu d) {
    this.phm = p;
    this.dm = d;
  }
  
  public void printMenu() {
    Iterator pi = phm.createIterator();
    printMenu(pi);
    Iterator di = dm.createIterator();
    printMenu(di);
  }
  
  public void printMenu(Iterator iterator) {
    while(iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.getName());
    }
  }
  
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}