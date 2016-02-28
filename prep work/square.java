import java.awt.*;

public class prep2 extends Animator {

    public void draw(int x, int y, Graphics g) {

        // draw a yellow 50x50 circle
        g.setColor(Color.yellow);
        g.fillRect(x-25,y-50,50,50);	// << fillOval changed to fillRect

        // draw a red line across the
        // middle of the circle
        g.setColor(Color.red);
        g.drawLine(x-25,y-25,x+25,y-25);

        } // end of draw method

    } // end of prep2 class
