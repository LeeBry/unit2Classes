import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class Moon
 * 
 * @Bryce Lee 
 * @version (a version number or a date)
 */
public class Moon
{
    /**
     * Draws the Moon
     *
     * @param    g2 the graphics context

     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.WHITE);
        g2.fillOval(35, 35, 75, 75);
    }
}
