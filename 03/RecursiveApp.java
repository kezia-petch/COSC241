/**Week 3 Assessment - Part One.
 *This class focuses around counting the digits of specific long
 *integers and adding digits together.
 */
package week03;
/**
 *Class RecursiveApp.
 *@author Kezia Somerville-Petch.
 */
public class RecursiveApp{
    /**Main method of RecursiveApp.
     *No content within this method.
     *@param args Command line argument.
     */
    public static void main(String[] args){
    }
    /**Recursive method called digits where a long value is returned.
     *This method returns a long integer representing how many digits are
     *present within the parameter long value entered.
     *@param n a long integer being manipulated via reclusion within the method.
     *@return returns the amount digits within the parameter.
     */                                     
    public static long digits(long n){
        System.out.println("Recursion "+ n);
        if (n < 10){
            return 1;
        }
        return 1 + digits(n/10);
    }
    
    /**Recursive method called sumOfDigits where a long value is returned.
     *This method returns a long integer representing the sum of the digits
     *of the parameter long value entered.
     *@param n a long integer being manipulated via reclusion within the method.
     *@return returns the sum of all digits within the parameter.
     */
    public static long sumOfDigits(long n){
        if (n < 0) {
            return -1 * sumOfDigits(-1 * n);
        }    
        long lastDigit = n % 10;
               
        if (n < 10){
            return lastDigit;
        }
        return lastDigit + sumOfDigits(n/10); 
    }
}
