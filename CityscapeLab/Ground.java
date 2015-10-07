import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.awt.Color;
/**
 * This draws the ground of the city
 * 
 * @Bryce Lee
 * @Version1
 */
public class Ground
{
    
    /**
     * Draws the ground
     * @param    g2 the graphics context
 
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.black);  
        g2.fillRect(0, 540, 785, 25);
    }
}
