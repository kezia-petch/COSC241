/**Week 2 Assessment.
 *This class focuses around the array coins which is modified in
 *numerous ways within the different methods.
 */

package week02;
import java.util.Random;
/**
 *Class Coins.
 *It initially defines and initialises variables.
 *@author Kezia Somerville-Petch.
 */
public class Coins{
    /**Final variable for Coins class.
     * @param HEADS boolean variable, true = HEADS.
     */
    public static final boolean HEADS = true;
    /**Final variable for Coins class.
     *@param TAILS boolean variable, false = TAILS.
     */
    public static final boolean TAILS = false;
    /**String variable for Coins class.
     *@param coinSeries string representing the series of H and T
     *within the coins array.
     */
    String coinSeries = "";
    /**Private array for Coins class.
     *@param coins is a boolean array containing data values of
     *HEADS and TAILS.
     */
    private boolean[] coins;
    /**Main method of Coins.
     *Defines new variables and creates instances of the class Coins
     *to test the methods within Coins.
     *@param args Command line argument.
     */
    public static void main (String[] args){
        boolean [] b = {HEADS, TAILS, HEADS, HEADS, TAILS};
        Coins c = new Coins(b);
        System.out.println(c);

        String coinTosses = "HTHTHTHTTTTHHHH";
        int coinTosses2 = 10;
        Coins d = new Coins(coinTosses2);
        System.out.println(d); 
    }
    /**Coins Contrustor.
     *This contructor sets the value of the array coins to the input.
     @param coins boolean array called coins.
    */
    public Coins(boolean[] coins) {
        this.coins = coins;
    }
    /**Coins Constructor.
     *This constructor creates a coins boolean array from
     *a string that has been input into the constructor.
     *@param c String consisting entirely of H and T characters
     *to represent HEADS and TAILS, called c.
     */
    public Coins (String c){
        int count = 0;
        this.coins = new boolean[c.length()];
        while (count < c.length()){
            if (c.charAt(count) == 'H'){
                this.coins[count] = HEADS;
            } else {
                this.coins[count] = TAILS;
            }
            count++;
        }
    }
    /**Coins Constructor.
     *This constructor creates a boolean array with the size
     *of the input int variable length, it fills this new array
     *with random values of either HEADS or TAILS.
     *@param length integer variable that determines the size of the
     *created boolean array coins.
     */
    public Coins (int length){
        Random rand = new Random();
        coins = new boolean[length];
        int count = 0;
        while (count < length){
            coins[count] = rand.nextBoolean();
            if (coins[count]){
                coins[count] = HEADS;
            } else{
                coins[count] = TAILS;
            }
            count++;
        }
    }
    /**Coins method called countRuns where an integer value is returned.
     *This method returns an integer representing the
     *amount groups of H and T (runs) within coins array.
     *@return returns an in representing the amount of runs within
     *the boolean coins array.
     */

    public int countRuns(){
        int run = 1;
        for(int i = 1; i < coins.length; i++){
            if (coins[i] != coins[i-1]){
                run += 1;
            }
        }
        return run;
    }
    /**Coins method called countHeads where an integer value is returned.
     *This method returns an integer representing how many HEADS are
     *present within the array coins.
     *@return returns the amount of HEADS within the coins array.
     */
    public int countHeads(){
        int heads = 0;
        int count = 0;
        while (count < coins.length){
            if (coins[count] == HEADS){
                heads++;
            }
            count++;
        }
        return heads;
    }
    /**Coins method called toString where a string is returned.
     *This method returns a string only consisting of H and T
     *to represent the HEADS and TAILS within the arrays coins.
     *@return returns a string consisting of only  H and T
     *representing the amount of HEADS and TAILs within coins array.
     */
    public String toString(){
        int count = 0;
        while (count < coins.length){
            if (coins[count] == HEADS){
               
                coinSeries += "H";
            } else {
                coinSeries += "T";
            }
            count++;
        }
        return coinSeries;
    }
}
