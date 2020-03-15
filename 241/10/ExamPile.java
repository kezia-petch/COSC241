package week10;

import java.util.*;

/**
 * An interface containing a number of methods.
 *
 * 241 Assignment.
 *
 * @author Kezia Somerville-Petch
 */

public interface ExamPile {
    public void load(int[] items);
    public int size();
    public int peek();
    public int mark();
    public void delay();
    public String sortingSteps();
    public boolean equals();
    
}

