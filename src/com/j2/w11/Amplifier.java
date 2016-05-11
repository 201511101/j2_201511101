package com.j2.w11;

public class Amplifier {
  String description;
  Tuner tuner;
  DvdPlayer dvd;
  
  public Amplifier(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " on");
  }
  
  public void off() {
    System.out.println(description + " off");
  }
  
  public void setDvd(DvdPlayer dvd) {
    System.out.println(description + " setting DVD Player to " + dvd);
  }
  
  public void setTuner(Tuner tuner) {
    System.out.println(description + " setting Tuner to " + tuner);
  }
  
  public void setVolume(int level) {
    System.out.println("Volume : "+level);
  }
  
  public String toString() {
    return description;
  }
}
