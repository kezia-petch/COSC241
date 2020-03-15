package week03;

/**Class Tower - Week 3 Assessment: Part 2.
 *A recursive representation of a tower of blocks.
 *
 *@author Michael Albert
 *@author Kezia Somerville-Petch
 */
public class Tower{

    /**The top block. */
    private char top;
 
    /**The rest of the tower. */
    private Tower rest;

    /**
     *Creates a new empty Tower.
     */
    public Tower() {
        this.top = ' ';
        this.rest = null;
    }

    /**
     *External classes can only create empty towers and manipulate
     *them using public methods, because this constructor is
     *private.
     *@param top the top block in this tower
     *@param rest the rest of the tower
     */
    private Tower(char top, Tower rest) {
        this.top = top;
        this.rest = rest;
    }

    /**
     *Returns true if this tower is empty, otherwise false.  Empty
     *towers are represented with the top block being a space
     *character.
     *@return whether the tower is empty or not.
     */
    public boolean isEmpty() {
        return top == ' ';
    }

    /**
     *Creates a new tower by adding the given block to the top of
     *this tower.
     *@param block a block to add to the top of this tower.
     *@return a new tower created by adding a block to the top of
     *this tower.
     */
    public Tower add(char block) {
        return new Tower(block, this);
    }
    /**Tower method called height where an integer is returned
     *This method returns a integer representing the height of the tower
     *instance.
     *@return returns an integer representing the height of the tower.
     */
    public int height(){
        if(isEmpty()){
            return 0;
        }else{
            return 1 + this.rest.height();
        }
        
    }
    /**Tower method called count where a integer is returned.
     *This method returns a integer representing the number of blocks that
     *are equal to the parametre character (represent the same colour as
     *the char).
     *@param c a character representing colour. 
     *@return returns the number of blocks that match the char (represent the
     *same colour as the parametre).
     */
    public int count (char c){
        char character = c;
        if(isEmpty()){
            return 0;
        }
        if (this.top == c){
            return 1 + this.rest.count(character);
        }
        if (this.rest.equals(c)){
            return 1 + this.rest.count(character);
        }else{
            return this.rest.count(character);
        }
    }
        
    /**Main method of Tower.
     *Creates a instance of Tower so it can test various methods.
     *@param args Command line argument.
     */    
    public static void main(String[]args){
        Tower a = new Tower().add('A').add('B').add('C').add('D').add('A');
        System.out.println(a.height());
    }
}
