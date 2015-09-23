import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * A car shape that can be positioned anywhere on the screen.
 * */

public class Target
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a target with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Target(int x, int y)
    {
        xLeft=x;
        yTop= y;
    }

    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body= new Rectangle(xLeft, yTop+ 10, 60, 10);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenY = screenSize.getHeight();
        double screenX= screenSize.getWidth();
        Ellipse2D.Double Circle1
        =new Ellipse2D.Double(screenX/10,screenY/10,10,10);
        Ellipse2D.Double Circle2
        =new Ellipse2D.Double(screenX/10,screenY/10,100,100);

        
        g2.draw(Circle1);
        g2.draw(Circle2);
    }
}

                        