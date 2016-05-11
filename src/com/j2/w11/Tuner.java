package com.j2.w11;

public class Tuner {
  String description;
  Amplifier amplifer;
  double frequency;
  
  public Tuner(String description, Amplifier amplifier) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " on");
  }
  
  public void off() {
    System.out.println(description + " off");
  }
  
  public void setFrequency(double frequency) {
    this.frequency = frequency;
    System.out.println("Frequency : "+frequency);
  }
}

