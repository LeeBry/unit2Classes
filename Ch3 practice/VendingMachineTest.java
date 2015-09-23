

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFillUp()
    {
        VendingMachine Candy = new VendingMachine(0,0); 
        Candy.fillUp(5);
        assertEquals( 5,Candy.getCanCount());
        Candy.fillUp(5);
        assertEquals( 10,Candy.getCanCount());
}
 @Test
    public void testInsertToken()
    {
        VendingMachine Candy = new VendingMachine(10,10); 
        Candy.insertToken();
        assertEquals( 11,Candy.getTokenCount());
        Candy.insertToken();
        assertEquals( 12,Candy.getTokenCount());
}
 @Test
    public void testGetTokenCount()
    {
        VendingMachine Candy = new VendingMachine(10,10); 
        Candy.insertToken();
        assertEquals( 11,Candy.getTokenCount());
        Candy.insertToken();
        assertEquals( 12,Candy.getTokenCount());
}
 @Test
    public void testGetCanCount()
    {
        VendingMachine Candy = new VendingMachine(10,10); 
        Candy.insertToken();
        assertEquals( 9,Candy.getCanCount());
        Candy.insertToken();
        assertEquals( 8,Candy.getCanCount());
}
}