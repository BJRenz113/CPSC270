import java.util.NoSuchElementException;

/**
 * Class in which the List ADT interface is implemented
 * 
 * @author Brennan Renz
 * @version 3/26/22
 */
public class ListIMP
    implements ListADT {

    /**
     * contains data points
     */
    char[] listArray;
    
    /**
     * Tracks cursor position
     */
    int    curr;
   
    /**
     * maximum size of array
     */
    int    maxSize;
   
    /**
     * number of elements currently in array
     */
    int    listSize;

    /**
     * 
     * Create a new ListIMP object.
     */
    public ListIMP() {
        maxSize = 10;
        listSize = 0; 
        curr = 0;
        listArray = new char[maxSize];
    }


    /**
     * Determines if o is equal to this ListADT. Two list ADTS are equal if they
     * have the same number of elements, the same current position, and elements
     * are in the same position.
     * 
     * @param o
     *            - reference to object to check for equality
     * @return true if this equals o, false else
     */
    public boolean equals(Object o) {
        String str1 = this.toString();
        String str2 = o.toString();
        if (o == null || !(o instanceof ListIMP)
            || (str1.length() != str2.length())) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Gets current element, throws a NoSuchElementException otherwise
     * 
     * @return the current element
     */
    public char get()
        throws NoSuchElementException {
        if (curr < 0 || curr >= maxSize) {
            throw new NoSuchElementException("nope");
        }
        return listArray[curr];
    }


    /**
     * Adds c to this ListADT at current position. If not possible, no change is
     * made.
     * 
     * @param c
     *            - char to add
     */
    public void insert(char c) {
        if (curr >= maxSize) {
            return;
        }
        for (int i = listSize; i > curr; i--) {
            listArray[i] = listArray[i - 1];
        }
        listArray[curr] = c;
        listSize++;

    }


    /**
     * Moves the cursor one position towards the tail of the list
     * 
     * @return true if it was possible to move, false else
     */
    public boolean next() {
        if (curr < 0 || curr >= listSize) {
            return false;
        }
        curr = (curr + 1);
        return true;
    }


    /**
     * Moves the cursor one position towards the head of the list
     * 
     * @return true if it was possible to move, false else
     */
    public boolean prev() {
        if (curr <= 0 || curr > listSize) {
            return false;
        }
        curr = curr - 1;
        return true;
    }


    /**
     * Removes the current element from this list. If it is not possible to do
     * so then this method makes no changes (i.e., it just returns).
     */
    public void remove() {
        if (curr < 0 || curr >= listSize) {
            return;
        }
        for (int i = curr; i < listSize; i++) {
            listArray[i] = listArray[i + 1];
            listSize--;
        }
    }


    /**
     * Produces a ListADT containing the list elements from position s to
     * position f, not including f. Calling subList(1,3) on the list with state
     * <a,b|c,d> will produce the subList <|b,c>. Note that the current position
     * of the subList is always 0. Furthermore, the original ListADT is not
     * changed.
     * 
     * @param s
     *            - starting position
     * @param f
     *            -finishing position (not included in the returned array)
     * @return reference to the sub list
     */
    public ListADT subList(int s, int f) {
        ListIMP sub1 = new ListIMP();
        int idx = 0;
        if ((s < 0) || (f <= s) || (s >= listSize)) {
            return sub1;
        }
        if (s < listSize && f >= listSize) {
            for (int i = s; i <= listSize; i++) {
                sub1.listArray[idx] = listArray[i];
                idx++;
            }
            return sub1;
        }
        for (int i = s; i < f; i++) {
            sub1.listArray[idx] = this.listArray[i];
            sub1.curr = 0;
            sub1.listSize++;
            idx++;
        }
        return sub1;
    }


    /**
     * Gets a String representation of the state of this list
     * 
     * @return string representation of the list's state
     */
    @Override
    public String toString() {
        String returnStr = "<";
        if (curr == 0) {
            returnStr = returnStr + "|";
        }
        for (int i = 0; i <= listSize - 1; i++) {
            returnStr = returnStr + listArray[i];
            if (i == curr - 1) {
                returnStr = returnStr + "|";
            }
            if (i < (listSize - 1) && (i != curr - 1)) {
                returnStr = returnStr + ",";
            }
        }
        returnStr = returnStr + ">";
        return returnStr;
    }

}
