import java. awt.*;

public class good2 extends Animator {

    public void draw(int x, int y, Graphics g) { // << void and int added

        // draw a black 40x40 circle
        g.setColor(Color.black);
        g.fillOval(x-20,y-40,40,40);

        // draw a white line across the
        // middle of the circle
        g.setColor(Color.white);	// << white spelled right
        g.drawLine(x-20,y-20,x+20,y-20);// << fourth argument added

        } // end of draw method

    } // end of good2 class		// << "}" added
