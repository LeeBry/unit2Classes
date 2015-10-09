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
 * @Version 1
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
        GradientPaint gp = new GradientPaint(0, 300,new Color(0,100,0),0, 600,new Color(85,107,47));
        g2.setPaint(gp);
        Ellipse2D.Double hill1= new Ellipse2D.Double(0, 520, 150, 100);
        g2.fill(hill1);
        Ellipse2D.Double hill2= new Ellipse2D.Double(600, 420, 300, 300);
        g2.fill(hill2);

    }

}
