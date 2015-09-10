

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank.
 * The car may be driven which reduces tha amount of gas in the fuel tank.
 * @author (Bryce Lee) 
 * @version (September 10th, 2015)
 */
public class Car
{
    /**The fuelEfficiency for the car measured in units of miles / gallon (MPG) */
    private double fuelEfficiency;
    /** the amount of fuel in the tank of the car measured in units of gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency )
    {
        fuelEfficiency = fuelEfficiency;
        fuelInTank=0;
    }

    /**
     * This method simulates driving the car for the specified distance and reduces the amount
     * of gas in the fuel tank
     *
     * @pre        The specified distance will not sonsume more the available gas
     *        
     *
     *            (what the method guarantees upon completion)
     * @param    distance      The specified distance to drive in units of miles
     * 
     */
    public void drive(double distance)
    {
        // put your code here
        return x+y;
    }

}
