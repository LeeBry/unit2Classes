import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.util.Random;
import java.awt.geom.Line2D;
import java.awt.Color;
/**
 * class Building makes the buildings. 
 * 
 * @Bryce Lee 
 * @Version 1
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
        g2.setColor(Color.white);
        Rectangle2D.Double bounds = new Rectangle2D.Double(100, 350, 100, 400);
        g2.fill(bounds);
        g2.setColor(Color.black);
        Rectangle2D.Double bounds1 = new Rectangle2D.Double(200, 400, 100, 400);
        g2.fill(bounds1);
        g2.setColor(Color.white);
        Rectangle2D.Double bounds2 = new Rectangle2D.Double(300, 300, 100, 400);
        g2.fill(bounds2);
        g2.setColor(Color.black);
        Rectangle2D.Double bounds3 = new Rectangle2D.Double(400, 312, 100, 400);
        g2.fill(bounds3);

    }
}
