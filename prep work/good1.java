import java.awt.*;

public class good1 extends Animator {	// << class name fixed

    public void draw(int x, int y, Graphics g) {

        // draw a black 40x40 circle
        g.setColor(Color.black);
        g.fillOval(x-20,y-40,40,40);	// << @ sign changed to -

        // draw a white line across the    << / removed from following line
        // middle of the circle
        g.setColor(Color.white);	// << "(" added
        g.drawLine(x-20,y-20,x+20,y-20);

        } // end of sketch method

    } // end of good1 class
