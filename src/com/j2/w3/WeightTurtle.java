/*
 * @author nby
 * @since 20160314
 * to demo upcasting and downcasting
 */

package com.j2.w3;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtle extends Turtle {
    protected int weight;
    public WeightTurtle(int w) {
        weight=w;
        setColor(Color.red);
        setPenColor(Color.red);
    }
    public int getWeight() {
        return weight;
    }
}

