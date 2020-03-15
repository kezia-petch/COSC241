package week04;

/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Iain Hewson
 * @author Kezia Somerville-Petch
 */
public class TableauApp {

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        final int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp.toString(valid));
    }

    /**
     * Determines whether the array passed to it is a valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        
        return rowLengthsDecrease(t) && rowValuesIncrease(t) &&
            columnValuesIncrease(t) && isSetOf1toN(t);
    }

    /**
     * Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
    /**
     * Returns a boolean variable depending if no row is longer than
     * the previous row, otherwise returns false.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a boolean variable depending on row length.
     */   
    public static boolean rowLengthsDecrease (int[][] t){
        for (int row = 0; row < t.length-1; row++){
            if (t[row].length < t[row+1].length){
                return false;
            }
                
        }
        return true;
    }
        
    /**
     * Returns a boolean variable, true if from left to right in any
     * row, the integers are increasing, otherwise return false.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a boolean variable depending on integers increasing
     * from left to right in each row.    
     */
    public static boolean rowValuesIncrease(int[][] t){
        for (int row = 0; row < t.length; row++){
            for (int col = 0; col < t[row].length-1; col++){
                if (t[row][col] > t[row][col+1]){
                    return false;
                }
            }
        }
        return true;
      
    }

    public static boolean columnValuesIncrease(int[][] t){
        for (int row = 1 ; row < t.length; row++){
            for (int col = 0; col < t[row].length; col++){
                if (t[row-1][col] > t[row][col]){
                    return false;
                }
            }
        }
        return true; 
    }

    public static boolean isSetOf1toN(int[][] t){
        boolean[] values;
        int count = 0;

        for (int i = 0; i < t.length; i++){
            count += t[i].length;
        }
        values = new boolean[count];
        for (int row = 0; row < t.length; row++){
            for (int col = 0; col < t[row].length; col++){
                if (t[row][col] > count || t[row][col] < 1){
                    return false;
                }
                values[t[row][col]-1] = true;
            }
        }
        for (int i = 0; i < count; i++){
            if (!values[i]){
                return false;
            }
        }
        return true;
    }
}
