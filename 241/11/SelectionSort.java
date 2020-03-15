package week11;

/**
 * A Selection sort implementation which is able to be observed through
 * its Sorter superclass.
 *
 * @author Kezia Somerville-Petch
 */
public class SelectionSort extends Sorter{

    /**
     *  Create a new SelectionSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public SelectionSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums(){
        comparisons = 0;
        for(i = 0; i < nums.length; i++){
            swap(nums, i, minPosition(nums, i, nums.length));
        }
        update();
    }

    /**
     * Through this method you store a set variable in another data point
     * allowing a 'swap' to occur.
     *
     * @param nums the integers to sort.
     * @param i index of the smallest number.
     * @param j index of the number at the start of the nums array.
     */
    public void swap(Integer[] nums, int i, int j){
        int smallestNum = nums[i];
        nums[i] = nums[j];
        nums[j] = smallestNum;
    }
    /**
     * Through this method you store a set variable in another data point
     * allowing a 'swap' to occur.
     *
     * @param nums the integers to sort.
     * @param left start of the nums array, used to compare values throughout
     * the array.
     * @param right end of the array, used to make sure the for loop ends
     * when i = right.
     *
     * @return pos the position of the smallest number/value in the array.
     */ 
    public int minPosition(Integer[] nums, int left, int right){
        int pos = left;
        int minValue = nums[left];
        for (int i = left + 1; i < right; i++){
            if (nums[i] < minValue){
                pos = i;
                minValue = nums[i];
            }
        }
        ++comparisons;
        return pos;
    }
}
        
