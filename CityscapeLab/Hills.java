import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * In the background, draws the hills.
 * 
 * @Bryce Lee
 * @version (a version number or a date)
 */
public class Hills
{

    /**
     * Draws the Hills
     *
     * @param    g2 the graphics context
 
     */
    public void draw(Graphics2D g2)
    {
       g2.setColor(Color.green);
       
       g2.fillOval(0, 520, 150, 100);
       g2.fillOval(600, 420, 300, 300);
        	


        

 

    }

}
