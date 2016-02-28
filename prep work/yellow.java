import java.awt.*;

public class prep2 extends Animator {

    public void draw(int x, int y, Graphics g) {

        // draw a yellow 40x40 circle      << comment changed
        g.setColor(Color.yellow);	// << color changed
        g.fillOval(x-20,y-40,40,40);

        // draw a red line across the	   << comment changed
        // middle of the circle
        g.setColor(Color.red);		// << color changed
        g.drawLine(x-20,y-20,x+20,y-20);

        } // end of draw method

    } // end of prep2 class
