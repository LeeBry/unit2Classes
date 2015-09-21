

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (Bryce Lee) 
 * @version (September 17th, 2015)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int token;
    private int cans;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans, int token)
    {
        this.token= token;
        this.cans= cans;

    }

    /**
     * This method adds one more can to the machine.
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    
     * @return 
     */
    public void fillUp(int cans)
    {      
        this.cans += cans;
    }

        /**
     *This method returns the number of cans in the machine.
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * 
     */
    public int getCanCount()
    {
        return  cans;
    }
    
    /**
     * This method returns the number of tokens in the machine.
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  Token value
     */
    public int getTokenCount()
    {
        return token;
    }

    /**
     * This method inserts a token. The number of tokens is increased, 
     * and the number of cans is decreased. 
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * 
     */
    public void insertToken()
    {
        cans-=1;
        token+=1;
    }
}
