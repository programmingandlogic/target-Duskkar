/*
 * File: Rainbow.java
 * ------------------
 * This program is a stub for the Rainbow problem, which displays
 * a rainbow by adding consecutively smaller circles to the canvas.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
	
public class Rainbow extends GraphicsProgram {

    public void run() {
    	OuterCircle();
    	WhiteCenter();
    	InnerCircle();
    }
    //Creates the outer ring of the Target
    private void OuterCircle () {
   		GOval OuterRing = new GOval(getWidth() /2 -60,getHeight() /2 -60, 120, 120);
   		OuterRing.setFilled(true);
   		OuterRing.setColor(Color.RED);
   		add(OuterRing);
   	}
    //Creates the center white ring around the Target
   	private void WhiteCenter() {
   		GOval WhiteCenter = new GOval(getWidth() /2 -40,getHeight() /2 -40, 80, 80);
   		WhiteCenter.setFilled(true);
   		WhiteCenter.setColor(Color.WHITE);
   		add(WhiteCenter);
   	}
   	//Creates the middle circle of the Target
	private void InnerCircle() {
		GOval InnerCircle = new GOval(getWidth() /2 -25,getHeight() /2 -25, 50, 50);
		InnerCircle.setFilled(true);
		InnerCircle.setColor(Color.RED);
		add(InnerCircle);
	}
}
