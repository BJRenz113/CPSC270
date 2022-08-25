import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * Class in which the List ADT interface is implemented
 *  @author Brennan Renz
 *  @version 3/14/22
 */
public class ListIMP implements ListADT{
    private Object listArray[];
    private int curr;
    private int maxSize;
    private int listSize;
    //char[] myList = new char[maxSize];
    
    //constructor
    ListIMP(int size) {
        maxSize = size;
        listSize = curr = 0;
        listArray = new Object[size];
    }
    
    /**
     * Determines if o is equal to this ListADT. Two list ADTS are equal if they
     * have the same number of elements, the same current position, and elements
     * are in the same position.
     * @param  o - reference to object to check for equality
     * @return true if this equals o, false else
     */
    public boolean equals(Object o) {
        return false; //fake val
    }
    
    
    /**
     * Gets current element, throws a NoSuchElementException otherwise
     * @return the current element
     */
    public char get() throws NoSuchElementException{
        if (curr < 0 || curr >= maxSize){
            throw new NoSuchElementException();
        }
        return myList[curr];
        }
    
    
    
    /**
     * Adds c to this ListADT at current position. If not possible, no change is 
     * made.
     * @param c - char to add
     */
    public void insert(char c) {
        if (curr >= maxSize) {
            return;
        }
        for (int i = curr; i>curr; i--) {
          myList[i] = myList[i-1];
          myList[curr] = c;
          
        }
        
    }
    
    /**
     * Moves the cursor one position towards the tail of the list
     * @return true if it was possible to move, false else
     */
    public boolean next() {
        if (curr<0 || curr<=maxSize) {
            return false;
        }
        curr = curr+1;
        return true;
    }
    
    
    /**
     * Moves the cursor one position towards the head of the list
     * @return true if it was possible to move, false else
     */
    public boolean prev() {
        if (curr<=0 || curr<maxSize) {
            return false;
        }
        curr = curr-1;
        return true;
    }
   
    
    /**
     * Removes the current element from this list. If it is not possible to do 
     * so then this method makes no changes (i.e., it just returns).
     */
    public void remove() {
        
    }
    
    
    /**
     * Produces a ListADT containing the list elements from position s to 
     * position f, not including f. Calling subList(1,3) on the list with state 
     * <a,b|c,d> will produce the subList <|b,c>. Note that the current position
     * of the subList is always 0. Furthermore, the original ListADT 
     * is not changed.
     * @param s - starting position
     * @param f -finishing position (not included in the returned array)
     * @return reference to the sub list
     */
    public ListADT subList(int s, int f) {
        return; //fake val
    }
    
    
    /**
     * Gets a String representation of the state of this list
     * @return string representation of the list's state
     */
    public String toString() {
        return; //fake val
    }

}
