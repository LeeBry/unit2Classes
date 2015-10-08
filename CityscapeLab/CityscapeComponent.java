import java.awt.Color;
import java.awt.GradientPaint;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Building buildingA;
    private Moon moon;
    private int numStars;
    private Stars aStars;
    private Hills backhills;
    private Ground ground1;

    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    /**
     * Constructor for objects of class CityscapeComponent
     * @param Uses the user interger value to place number of stars in the cityscape. 
     */
    public CityscapeComponent(int stars)
    {
        numStars= stars;
        moon= new Moon();
        backhills= new Hills();
        buildingA= new Building();
        ground1=new Ground();
        aStars= new Stars(numStars);

   
    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     *@param    g2 the graphics context
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method on each object in your Cityscape
        // lines below are for the gradient
        int w = getWidth();
        int h = getHeight(); 
        GradientPaint gp = new GradientPaint(0, 0,new Color(25,25,112),0, h, Color.WHITE);
        g2.setPaint(gp);
        g2.fillRect(0, 0, w, h);
        
        // Below are the drawing methods for all instance variables
        backhills.draw(g2);
        moon.draw(g2);
        buildingA.draw(g2);
        aStars.draw(g2);
        ground1.draw(g2);
    }
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        aStars.starLess();

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
