package com.j2.w9;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garagedoor;
  public GarageDoorOpenCommand(GarageDoor garagedoor) {
    this.garagedoor = garagedoor;
  }
  
  public void execute() {
    garagedoor.up();
  }
}

