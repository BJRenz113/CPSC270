import java.util.NoSuchElementException;

/**
 * Class in which the List ADT interface is implemented
 * 
 * @author Brennan Renz
 * @version 3/14/22
 */
public class ListIMP
    implements ListADT {

    private Link head;
    private Link tail;
    private Link curr;
    private int  listSize;

    /**
     * Create a new ListIMP object.
     */
    public ListIMP() {
        curr = new Link(null);
        tail = new Link(null);
        curr = tail;
        head = new Link(null);
        listSize = 0;
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
        return (str1.compareTo(str2)) == 0;
    }


    /**
     * Gets current element, throws a NoSuchElementException otherwise
     * 
     * @return the current element
     */
    public char get()
        throws NoSuchElementException {
        if (curr == tail) {
            throw new NoSuchElementException(
                "attempting to access invalid element");
        }
        return curr.element();
    }


    /**
     * Adds c to this ListADT at current position. If not possible, no change is
     * made.
     * 
     * @param c
     *            - char to add
     */
    public void insert(char c) {
        curr.setNext(new Link(curr.element(), curr.next()));
        curr.setElement(c);
        if (listSize == 0) {
            head = curr;
        }
        if (tail == curr) {
            tail = curr.next();
        }
        listSize++;
    }


    /**
     * Moves the cursor one position towards the tail of the list
     * 
     * @return true if it was possible to move, false else
     */
    public boolean next() {
        if (curr == tail) {
            return false;
        }
        curr = curr.next();
        return true;
    }


    /**
     * Moves the cursor one position towards the head of the list
     * 
     * @return true if it was possible to move, false else
     */
    public boolean prev() {
        if (curr == head) {
            return false;
        }
        Link temp = head;
        while (temp.next() != curr) {
            temp = temp.next();
        }
        curr = temp;
        return true;
    }


    /**
     * Removes the current element from this list. If it is not possible to do
     * so then this method makes no changes (i.e., it just returns).
     */
    public void remove() {
        if (curr == tail) {
            return;
        }
        curr.setElement(curr.next().element());
        if (curr.next() == tail) {
            tail = curr;
        }
        curr.setNext(curr.next().next());
        listSize--;
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
        String str1 = this.toString();
        String simpleData = " ";
        ListIMP sol = new ListIMP();
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (Character.isLetter(currentChar)) {
                simpleData += str1.charAt(i);
            }
        }

        if (s < listSize && f > listSize) {
            for (int k = f; k >= s; k--) {
                sol.insert(simpleData.charAt(k));
            }
            return sol;
        }

        if ((s < 0) || (f <= s) || (s >= listSize)) {
            return sol;
        }

        for (int j = f; j > s; j--) {
            sol.insert(simpleData.charAt(j));
            sol.listSize++;
        }

        return sol;

    }


    @Override
    /**
     * Gets a String representation of the state of this list
     * 
     * @return string representation of the list's state
     */
    public String toString() {
        String sol = "<";
        Link token = head;
        if (listSize == 0 || curr == token) {
            sol += "|";
        }
        while (token.next() != tail.next()) {
            sol += token.element();
            if (token.next() == curr) {
                sol += "|";
            }
            else if (token.next() != tail) {
                sol += ',';
            }
            token = token.next();
        }
        sol += ">";
        return sol;
    }

}
