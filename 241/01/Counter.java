/** Week 1 Assessment.
 * This class takes an input from the user and counts
 * the number of words and lines
 * within that input and then displays that back to the user.
 */

package week01;
import java.util.Scanner;

/**
 *Class Counter.
 *@author Kezia Somerville-Petch.
 */
public class Counter{
    /**Main method of Counter.
     *Takes an input from the user, scans this input
     *and determines the amount of
     *lines and words within the input.
     *@param args Command line argument.
     */
    public static void main (String []args){
        int lines = 0;
        int words = 0;
        Scanner sc = new Scanner (System.in);
        while(sc.hasNextLine()){
            String lineInput = sc.nextLine();
            Scanner wordScanner = new Scanner(lineInput);
            lines += 1;
            while(wordScanner.hasNext()){
                String word = wordScanner.next();
                words += 1;
            }
        }
        System.out.println("lines: " + lines);
        System.out.println("words: " + words);
    }
}
        
