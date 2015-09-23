import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;


public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenY = frame.getHeight();
        double screenX= frame.getWidth();
        
        frame.setSize(500,500);
        frame.setTitle("Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component= new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}