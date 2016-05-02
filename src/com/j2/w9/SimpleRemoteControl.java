package com.j2.w9;

public class SimpleRemoteControl {
  private Command slot;
  public void setCommand(Command command) {
    slot = command;
  }
  public void buttonPressed() {
    slot.execute();
  }
}
