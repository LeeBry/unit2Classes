import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.Dimension;
import java.util.Random;
import java.awt.geom.Line2D;
import java.awt.GradientPaint;
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
        g2.setColor(Color.black);
        // These Rectangles will be the Outline of the buildings
        Rectangle2D.Double bounds = new Rectangle2D.Double(100, 350, 100, 500);
        Rectangle2D.Double bounds1 = new Rectangle2D.Double(200, 400, 100, 400);
        Rectangle2D.Double bounds2 = new Rectangle2D.Double(300, 300, 100, 300);
        Rectangle2D.Double bounds3 = new Rectangle2D.Double(400, 312, 100, 400);
        // Fills the bounds with black
        g2.fill(bounds);
        g2.fill(bounds1);
        g2.fill(bounds2);
        g2.fill(bounds3);
        // This will be the color of the buildings
        Rectangle2D.Double build = new Rectangle2D.Double(110, 360, 80, 500);
        Rectangle2D.Double build1 = new Rectangle2D.Double(210, 410, 80, 400);
        Rectangle2D.Double build2 = new Rectangle2D.Double(310, 310, 80, 300);
        Rectangle2D.Double build3 = new Rectangle2D.Double(410, 322, 80, 400);
        g2.setColor(new Color(169,169,169));
        //This will color the buildings Grey
        g2.fill(build);
        g2.fill(build1);
        g2.fill(build2);
        g2.fill(build3);
        

    }
}
