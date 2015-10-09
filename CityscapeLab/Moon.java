import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
/**
 * class Moon places a moon in the sky
 * 
 * @Bryce Lee 
 */
public class Moon
{
    public int x;
    public int y;
    /**
     * Constructor for objects of class Moon
     */
    public Moon()
    {
        int x= 35;
        int y= 35;
    }
    
    /**
     * Draws the Moon
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(new Color( 255,248,220));
        Ellipse2D.Double moon= new Ellipse2D.Double(x, y, 75, 75);
        g2.fill(moon);
    }
}
