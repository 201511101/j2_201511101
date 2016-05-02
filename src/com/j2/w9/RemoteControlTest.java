package com.j2.w9;

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    GarageDoor garageDoor = new GarageDoor();
    Light light = new Light();
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
    LightOnCommand lightOn = new LightOnCommand(light);
    
    remote.setCommand(lightOn);
    remote.buttonPressed();
    remote.setCommand(garageOpen);
    remote.buttonPressed();
  }
}
