
/**
 *  Implementation for a List ADT 
 * 
 *  @author Brennan Renz 
 *  @version 2/23
 */
public interface ListADT {
    
    /**
     * Determines if o is equal to this ListADT. Two list ADTS are equal if they
     * have the same number of elements, the same current position, and elements
     * are in the same position.
     * @param  o - reference to object to check for equality
     * @return true if this equals o, false else
     */
    @Override
    boolean equals(Object o);
    
    
    /**
     * Gets current element, throws a NoSuchElementException otherwise
     * @return the current element
     */
    char get();
    
    
    /**
     * Adds c to this ListADT at current position. If not possible, no change is 
     * made.
     * @param c - char to add
     */
    void insert(char c);
    
    
    /**
     * Moves the cursor one position towards the tail of the list
     * @return true if it was possible to move, false else
     */
    boolean next();
    
    
    /**
     * Moves the cursor one position towards the head of the list
     * @return true if it was possible to move, false else
     */
    boolean prev();
    
    
    /**
     * Removes the current element from this list. If it is not possible to do 
     * so then this method makes no changes (i.e., it just returns).
     */
    void remove();
    
    
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
    ListADT subList(int s, int f);
    
    
    /**
     * Gets a String representation of the state of this list
     * @return string representation of the list's state
     */
    @Override
    String toString();
    
}
