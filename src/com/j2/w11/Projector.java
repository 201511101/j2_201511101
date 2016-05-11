package com.j2.w11;

public class Projector {
  String description;
  DvdPlayer dvd;
  
  public Projector(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description+" On");
  }
  
  public void off() {
    System.out.println(description+" Off");
  }
  
  public void wideScreenMode() {
    System.out.println("Wide Screen Mode");
  }
}
