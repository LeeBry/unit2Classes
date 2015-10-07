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
    public CityscapeComponent(int stars)
    {
        numStars= stars;
        Moon moon= new Moon();
        Hills backhills= new Hills();
        Building buildingA= new Building();
        Ground ground1=new Ground();
        Stars aStars= new Stars(numStars);

   
    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method on each object in your Cityscape
        // lines below are for the gradient
        int w = getWidth();
        int h = getHeight(); 
        GradientPaint gp = new GradientPaint(0, 0, Color.BLACK,0, h, Color.WHITE);
        g2.setPaint(gp);
        g2.fillRect(0, 0, w, h);
        
        //lines below are the constructors for Hills

        backhills.draw(g2);
        // lines below are the constructors for sun

        moon.draw(g2);
        // lines below are the constructors for Building

        buildingA.draw(g2);
        // lines below are the constructors for Stars

        aStars.draw(g2);
        // lines below are the constructors for Stars

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
