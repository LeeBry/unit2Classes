import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class Stars
 * 
 * @Bryce Lee 
 * @version (a version number or a date)
 */
public class Stars 
{
    public int stars;
    public Stars(int stars)
    {
        this.stars= stars;
    }
    /**
     * Draws the stars
     *
     * @param    g2 the graphics context

     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.YELLOW);
        Random gener= new Random();
        int t = stars;
        while (t>=0)
        {
            int randJump= gener.nextInt(785);
            int yrandJump= gener.nextInt(250);
            g2.fillOval(randJump, yrandJump,3, 3);
            t-=1;

        
 
        }

    }
}
