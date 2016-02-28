import java.awt.*;

public class prep2 extends Animator {

    public void draw(int x, int y, Graphics g) {

        // draw a black 50x50 Square
        g.setColor(Color.yellow);
        g.fillRect(x-25,y-50,50,50);

        // draw a red line across the
        // middle of the square
        g.setColor(Color.red);
        g.drawLine(x-25,y-0,x+25,y-50);

        } // end of draw method

    } // end of prep2 class
