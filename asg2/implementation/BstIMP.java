import java.util.NoSuchElementException;

/**
 * Implementation for Binary Search Trees
 * 
 * @author Brennan Renz
 * @version 4/11/22
 */
public class BstIMP
    implements BstADT {

    private Node   root;
    private int    nodeCount;
    private String els;

    /**
     * {@inheritDoc}
     */
    public boolean find(String s) {
        boolean sol = false;
        if (this.root == null || findHelp(root, s) == null) {
            sol = false;
        }
        else if (findHelp(root, s).compareTo(s) == 0) {
            sol = true;
        }
        return sol;
    }


    /**
     * {@inheritDoc}
     */
    public void insert(String s)
        throws NoSuchElementException {
        if (s == null || !(s.matches("[a-zA-Z0-9]+"))) { 
            throw new NoSuchElementException(
                "Attempting to insert invalid char");
        }
        if (root != null || !(this.toString().contains(s))) {
            root = insertHelp(root, s);
            nodeCount++;
        }

    }


    /**
     * {@inheritDoc}
     */
    public String pre() {
        if (this.root == null) {
            return "";
        }
        String solution = preHelp(root);
        return solution;

    }


    /**
     * {@inheritDoc}
     */
    public void remove(String s) {
        String temp = findHelp(root, s);
        if (temp != null) {
            root = removeHelp(root, s);
            nodeCount--;
        }
    }


    /**
     * {@inheritDoc}
     */
    public String toString() {
        if (this.root == null) {
            return "<>";
        }
        return "<" + pre() + ">";
    }


    /**
     * Insert helper method
     * 
     * @param rt
     *            - given node
     * @param s
     *            - the string to be inserted
     * @return rt post insert
     */
    private Node insertHelp(Node rt, String s) {
        if (rt == null) {
            return new Node(s);
        }

        if (rt.value().compareTo(s) >= 0) {
            rt.setLeft(insertHelp(rt.left(), s));
        }
        else {
            rt.setRight(insertHelp(rt.right(), s));
        }
        return rt;
    }


    /**
     * Pre helper method
     * 
     * @param n
     *            - given node
     * @return a string with node values in preorder
     */
    private String preHelp(Node n) {
        if (n == null) {
            return "";
        }
        els += n.value() + ",";
        preHelp(n.left());
        preHelp(n.right());
        return els.substring(4, els.length() - 1);
    }


    /**
     * Find helper method
     * 
     * @param rt
     *            - given root value
     * @param s
     *            - string to find
     * @return nodes
     */
    private String findHelp(Node rt, String s) {
        if (rt == null) {
            return null;
        }
        if (rt.value().compareTo(s) > 0) {
            return findHelp(rt.left(), s);
        }
        else if (rt.value().compareTo(s) == 0) {
            return rt.value();
        }
        else {
            return findHelp(rt.right(), s);
        }
    }


    /**
     * Remove helper
     * 
     * @param rt
     *            - given node
     * @param s
     *            - string to remove
     * @return nodes after removal
     */
    private Node removeHelp(Node rt, String s) {
        if (rt == null) {
            return null;
        }
        if (rt.value().compareTo(s) > 0) {
            rt.setLeft(removeHelp(rt.right(), s));
        }
        else if (rt.value().compareTo(s) < 0) {
            rt.setRight(removeHelp(rt.right(), s));
        }
        else {
            if (rt.left() == null) {
                return rt.right();
            }
            else if (rt.right() == null) {
                return rt.left();
            }
            else {
                Node temp = getMax(rt.left());
                rt.setValue(temp.value());
                rt.setLeft(deleteMax(rt.left()));
            }
        }
        return rt;
    }


    /**
     * Get maximum value for a binary tree
     * 
     * @param rt
     *            - given node
     * @return maximum value of tree
     */
    private Node getMax(Node rt) {
        if (rt.right() == null) {
            return rt;
        }
        return getMax(rt.right());
    }


    /**
     * Deletes maximum value of binary tree
     * 
     * @param rt
     *            - given node
     * @return nodes after deleting max
     */
    private Node deleteMax(Node rt) {
        if (rt.right() == null) {
            return rt.left();
        }
        rt.setRight(deleteMax(rt.right()));
        return rt;
    }

}
