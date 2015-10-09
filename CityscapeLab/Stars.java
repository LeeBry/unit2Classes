import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * class Stars draws how many stars the user want to put into the sky.
 * 
 * @Bryce Lee 
 * @param int stars must be above 0, and an integer
 */
public class Stars 
{
    public int stars;

    /**
     * Constructor for object of class Stars
     * @param Takes the user interger passed in through Cityscape viewer, to construct "X" 
     * amount of stars
     */public Stars(int stars)
    {
        this.stars= stars;
        if (stars <=0)
        {
            this.stars= 10;
        }
        
    }
    
    /**
     * Adds one star
     */public void starMore()
    {
        this.stars+=1;
    }
    
    /**
     * Takes away one star
     */
    public void starLess()
    {
        this.stars-=1;

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
            int yrandJump= gener.nextInt(600);
            g2.fillOval(randJump, yrandJump,3, 3);
            t-=1;

        
 
        }

    }
}
