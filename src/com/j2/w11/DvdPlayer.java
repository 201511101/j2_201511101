package com.j2.w11;

public class DvdPlayer {
  String description;
  Amplifier amplifier;
  String movie;
  
  public DvdPlayer(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " On");
  }
  
  public void off() {
    System.out.println(description + " Off");
  }
  
  public void play(String movie) {
    System.out.println("Playing "+movie);
  }
  
  public void stop() {
    System.out.println("Movie stopped");
  }
  
  public void eject() {
    System.out.println("DVD ejected");
  }
}