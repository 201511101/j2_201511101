package com.j2.w4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ch.aplu.turtle.*;

  
class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    TurtleKeyAdapter tka = new TurtleKeyAdapter();
    addKeyListener(new KeyAdapter() {
      class TurtleKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
          int keyCode=e.getKeyCode();
          switch(keyCode) {
            case KeyEvent.VK_UP:
              setStatusText("Forward 20");
              forward(20);
              break;
            case KeyEvent.VK_DOWN:
              setStatusText("Back 20");
              back(20);
              break;
            case KeyEvent.VK_LEFT:
              setStatusText("Left 20");
              left(20);
              break;
            case KeyEvent.VK_RIGHT:
              setStatusText("Right 20");
              right(20);
              break;
            case KeyEvent.VK_Q:
              setStatusText("Q Pressed and Exiting");
              break;
          }
        }
      }
    });
  }
}

public class TurtleKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t=new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any Key!");
  }
}