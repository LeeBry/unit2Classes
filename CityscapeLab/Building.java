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
     * Draws the car
     *
     * @param    g2 the graphics context
 
     */
    public void draw(Graphics2D g2)
    {

        g2.fillRect(100, 300, 150, 600);
        g2.setColor(Color.orange);
        g2.fillRect(200, 200, 400, 400);

 

    }

}
