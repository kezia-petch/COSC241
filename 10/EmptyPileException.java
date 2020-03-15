package week10;

/**
 * A Class that allows the use of the created EmptyPileException
 *
 * 241 Assignment.
 *
 * @author Kezia Somerville-Petch
 */

public class EmptyPileException extends Exception{

    /**
     * Method that allows the use of EmptyPileException.
     *
     * @param message allows the displaying of a message through the use of
     * a throw new EmptyPileException creation.
     *
     */
    public EmptyPileException(String message){
        super(message);
    }
}
