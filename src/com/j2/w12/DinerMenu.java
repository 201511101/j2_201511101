package com.j2.w12;
import java.util.ArrayList;

public class DinerMenu {
  //static final int MAX_ITEMS = 3;
  //int numberOfItems = 0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  
  public DinerMenu() {
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("menu1", "...1", true, 2.9);
    addItem("menu2", "...2", true, 1.9);
    addItem("menu3", "...3", true, 3.9);
    addItem("menu4", "...4", true, 4.9);
  }
  
  public void addItem(String name, String description, boolean v, double p) {
    MenuItem menuItem = new MenuItem(name, description, v, p);
    //if (numberOfItems >= MAX_ITEMS) {
    //  System.err.println("Error");
    //} else {
    //  menuItems[0] = menuItem;
    //  numberOfItems = numberOfItems+1;
    //}
    
    menuItems.add(menuItem);
  }
  
}