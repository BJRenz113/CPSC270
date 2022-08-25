
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author Brennan Renz
 * @version 4/11/22
 */
public interface BstADT {

    /**
     * Determines if s is in this BstADT.Determines if s is in this BstADT.
     * 
     * @param s
     *            - String to find
     */
    @SuppressWarnings("javadoc")
    boolean find(String s);


    /**
     * Inserts s into this BstADT but only if s is not already present (i.e., no
     * duplicates allowed). Any attempt to insert duplicates is ignored. NOTE:
     * the String s must contain only letters or numbers [a-zA-Z0-9] and can't
     * be empty
     * 
     * @param s
     *            - String to insert
     */
    void insert(String s);


    /**
     * Gets the preorder traversal of this BstADT. The preorder traversal
     * consists of the values of the Nodes of this BstADT separated by commas.
     * The values are given in preorder. No spaces or other punctuation is
     * present in the returned string. This method returns "" for an empty
     * BstADT.
     * 
     * @return comma separated values of this BstADT
     */
    String pre();


    /**
     * Removes s from this BstADT. No change is made to this BstADT if s is not
     * present.
     * 
     * @param s
     *            - String to remove
     */
    void remove(String s);


    /**
     * Gets the state string of this BstADT. The state string starts with "<"
     * followed by the preorder traversal of this BstADT, and ending with ">"
     * (there are no spaces or other punctuation in this state string). This
     * method returns "<>" for an empty BstADT.
     * 
     * @return state string
     */
    @Override
    String toString();

}
