import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.awt.Color;
/**
 * Write a description of class building
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{

    /**
     * Draws the building
     *
     * @param    g2 the graphics context

     */
    public void draw(Graphics2D g2)
    {

        g2.fillRect(100, 350, 100, 400);
        Rectangle bounds = new Rectangle(100, 350, 100, 400);
        g2.setColor(Color.black);
        g2.fillRect(200, 400, 100, 400);
        Rectangle bounds1 = new Rectangle(200, 400, 100, 400);
        g2.setColor(Color.white);
        g2.fillRect(300, 300, 100, 400);
        Rectangle bounds2 = new Rectangle(300, 300, 100, 400);
        g2.setColor(Color.black);
        g2.fillRect(400, 312, 100, 400);
        Rectangle bounds3 = new Rectangle(400, 312, 100, 400);

 
    }
}
