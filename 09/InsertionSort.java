package week09;

/**
 * A Insertion sort implementation which is able to be observed through
 * its Sorter superclass.
 *
 * @author Kezia Somerville-Petch
 */
public class InsertionSort extends Sorter{

    /**
     *  Create a new InsertionSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public InsertionSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums(){
        comparisons = 0;
        for(int i = 1; i < nums.length; i++){
            for (j = 1; j < nums.length; j++) {
                if (++comparisons > 0 && nums[j] < nums[j-1]) {
                    findInsert(nums, i, nums[i]);
                }
                update();
            }
        }
    }
    /**
     * Moves through the array finding the place where the value is to be
     * inserted back into the array.
     *
     * @param nums the integers to move through and find placement of a
     * value.
     * @param index the index of the placement of the value within nums.
     * @param value the value looking to be placed within nums.
     *
     */
    public void findInsert(Integer[] nums, int index, int value){
        index--;
        while(index >= 0 && nums[index] > value){
            nums[index+1] = nums[index];
            index--;
        }
        nums[index + 1] = value;
    }
}
            
