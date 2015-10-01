import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
   private int xLeft;
   private int yTop;
    /**
     * Default constructor for objects of class Car
     */
    public Car(int x,int y)
    {
        xLeft=x;
        yTop= y;
    }

    /**
     * Draws the car
     *
     * @param    g2 the graphics context
 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body= new Rectangle(xLeft, yTop+ 10, 60, 10);
       
        Ellipse2D.Double Circle1
        =new Ellipse2D.Double(50,50,100,100);
        Ellipse2D.Double Circle2
        =new Ellipse2D.Double(75,75,100,100);
        
        g2.draw(Circle1);
        g2.draw(body);
        g2.draw(Circle2);

    }

}
