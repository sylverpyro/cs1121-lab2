import java.awt.*;

public class prep2 extends Animator {

    public void draw(int x, int y, Graphics g) {

        // draw a yellow 50x50 circle	   << comment changed
        g.setColor(Color.yellow);
        g.fillOval(x-25,y-50,50,50);	// << arguments changed

        // draw a red line across the
        // middle of the circle
        g.setColor(Color.red);
        g.drawLine(x-25,y-25,x+25,y-25);// << arguments changed

        } // end of draw method

    } // end of prep2 class
