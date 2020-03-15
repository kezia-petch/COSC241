package week10;

import java.util.*;
/**
 * A Class (EP) that manipulates a stack through the use of various
 * methods.
 *
 * 241 Assignment.
 *
 * @author Kezia Somerville-Petch
 */
public class EP implements ExamPile{

    Stack<Integer> stack = new Stack<Integer>();
    
    /**
     * Method that checks if the stack is empty via the  built-in
     * stack function "isEmpty".
     *
     * @return returns true if the stack is empty, returns false
     * if it is not.
     */
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    /**
     * Method that loads an array into the stack by first creating a
     * reversed array and pushing that reversed array onto the stack, via
     * the built-in stack function "push".
     *
     * @param items an array of items to be loaded into the stack.
     */
    public void load(int[] items){
        int[] reversedArray = new int[items.length];
        int x = items.length;
        for(int i = 0; i < items.length; i++){
            reversedArray[x-1] = items[i];
            x = x-1;
        }
        for(int i = 0; i < reversedArray.length; i++){
            stack.push(reversedArray[i]);
        }
    }
    
    /**
     * Method that checks the size of the stack via the built-in
     * stack function "size".
     *
     * @return returns the size of the stack.
     */
    public int size(){
        return stack.size();
    }

    /**
     * Method that returns the value on top of the stack via the built-in
     * stack function "peek".
     *
     * @return returns the value on top of the stack.
     * @return returns the EmptyPileException when "peeking"/trying to return
     * the top value of an empty stack.
     */
    public int peek(){
        if(isEmpty()){
            System.out.println(new EmptyPileException("Peek on an empty stack"));
            return -1;
        }
        return stack.peek();
    }

    /**
     * Method that returns the value on top of the stack and removes that
     * value from the stack via the built-in stack function "pop".
     *
     * @return returns value on top of the stack.
     * @return returns the EmptyPileException when "popping"/trying to return (and remove)
     * the top value of an empty stack.
     */
    public int mark(){
        if(isEmpty()){
            System.out.println(new EmptyPileException("Mark on an empty stack"));
            return -1;
        }
        else{
        }
        return stack.pop();    
    }

    /**
     * Method that moves the value on the top of the stack to the bottom of
     * the stack, through the use of another stack and the built-in stack
     * function "push".
     *
     * @return returns the EmptyPileException when delaying/trying to move
     * the top value of an empty stack to the bottom of that empty stack.
     */
    public void delay(){
        if(isEmpty()){
            System.out.println(new EmptyPileException("Delay on an empty pile"));
            return;
        }
        Stack<Integer> newStack = new Stack<Integer>();
        int item = stack.pop();

        newStack.push(item);

        newStack.addAll(stack);
        stack = newStack;
    }

    public static EP reconstruct(String steps){
        return null;
    }

    public String sortingSteps(){
        return " ";
    }

    public boolean equals(){
        return true;
    }

    /**
     * toString method that returns a string containing the items in the stack separated by
     * a space.
     *
     * @return returns a string of the items in the stack.
     */
    public String toString(){
        String result = "";
        Object[] list = stack.toArray();
        for(int i = list.length-1; i >= 0; i--) {
            if(i == 0) {
                result += list[i];
            } else {
                result += list[i] + " ";
            }
        }
        return result; 
    }
}
  
