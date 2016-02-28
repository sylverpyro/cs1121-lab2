// Stacy Auger, Michael Benson
// Section 10
// Lab 2

import java.awt.*;

public class lab2 extends Animator {

    public void draw(Graphics g) {

	//draw a black 200x50 black building
	g.setColor(Color.black);
	g.fillRect(275,25,50,200);

	//draw two windows, one yellow, one white
	g.setColor(Color.yellow);
	g.fillRect(280,30,10,10);

	g.setColor(Color.white);
	g.fillRect(310,75,10,10);

        } // end of draw method

    } // end of lab2 class
