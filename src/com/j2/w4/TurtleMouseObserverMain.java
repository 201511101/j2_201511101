package com.j2.w4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import ch.aplu.turtle.*;

  
class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    TurtleMouseAdapter tka = new TurtleMouseAdapter();
    addMouseListener(new MouseAdapter() {
      class TurtleMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
          Point2D.Double p;
          // p=e.getPoint();
          p=toTurtlePos(e.getPoint());
          double d=distance(p);
          double w=towards(p);
          heading(w);
          forward(d);
          setStatusText("moving to "+p.toString());
        }
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point2D.Double p;
        // p=(Point2D.Double)e.getPoint()
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("Draging to "+p.toString());
      }
    });
  }
}

public class TurtleMouseObserverMain {
  public static void main(String[] args) {
    TurtleMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Press any Key!");
  }
}