
/**
 * Node class to support Binary Search Tree implementation
 * 
 * @author Brennan Renz
 * @version 4/11
 */
public class Node {

    private String element;
    private Node   left;
    private Node   right;
    // Constructors

    /**
     * No argument Node constructor
     */
    public Node() {
        left = null;
        right = null;
    }


    /**
     * One argument Node constructor
     * 
     * @param val
     *            -String value
     */
    public Node(String val) {
        left = null;
        right = null;
        element = val;
    }


    /**
     * Two argument Node constructor
     * 
     * @param val
     *            - String value
     * @param l
     *            - left node
     * @param r
     *            - right node
     */
    public Node(String val, Node l, Node r) {
        left = l;
        right = r;
        element = val;
    }


    /**
     * Accesses value of element
     * 
     * @return value of element
     */
    public String value() {
        return element;
    }


    /**
     * Sets value of element
     * 
     * @param v
     *            - String value
     */
    public void setValue(String v) {
        element = v;
    }


    /**
     * Accesses left node
     * 
     * @return left node
     */
    public Node left() {
        return left;
    }


    /**
     * Sets the left node
     * 
     * @param p -Desired left node
     *            
     */
    public void setLeft(Node p) {
        left = p;
    }


    /**
     * Accesses right node
     * 
     * @return right node
     */
    public Node right() {
        return right;
    }


    /**
     * Sets right node
     * 
     * @param p
     *            -Desired right node
     */
    public void setRight(Node p) {
        right = p;
    }


    /**
     * Determines if object is a leaf of this BST
     * 
     * @return true if leaf, false if otherwise
     */
    public boolean isLeaf() {
        return (left == null) && (right == null); // might be wrong idk taken
                                                  // from tb
    }

}
