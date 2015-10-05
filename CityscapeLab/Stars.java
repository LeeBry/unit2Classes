import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class Stars
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars 
{

    /**
     * Draws the stars
     *
     * @param    g2 the graphics context

     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.WHITE);
        Random gener= new Random();
        int t = 15;
        while (t>=0)
        {
            int randJump= gener.nextInt(785);
            int yrandJump= gener.nextInt(250);
            g2.fillOval(randJump, yrandJump,3, 3);

            t-=1;

        
 
        }

    }
}
