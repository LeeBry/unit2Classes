import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
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
       g2.setColor(Color.lightGray);     
       Ellipse2D.Double hill1= new Ellipse2D.Double(0, 520, 150, 100);
       g2.fill(hill1);
       Ellipse2D.Double hill2= new Ellipse2D.Double(600, 420, 300, 300);
       g2.fill(hill2);



        

 

    }

}
