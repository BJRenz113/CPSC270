
/**
 * Link class, allows linking of data points for linked list
 * 
 * @author Brennan Renz
 * @version 4/1/22
 */
public class Link {

    /** Link Sotred */
    public Link n;
    /** Data point stored */
    public char e;

    /**
     * Constructor with two fields
     * 
     * @param it
     *            data stored
     * @param inn
     *            desired next value
     */
    public Link(char it, Link inn) {
        this.e = it;
        this.n = inn;
    }


    /**
     * Constructor with only link field
     * 
     * @param inn
     *            desired next value
     */
    public Link(Link inn) {
        this.e = ' ';
        n = inn;
    }


    /**
     * Return the data field
     * 
     * @return data stored data value
     */
    public char element() {
        return e;
    }


    /**
     * Set the data field
     * 
     * @param it
     *            desired new data
     * @return new data
     */
    public char setElement(char it) {
        e = it;
        return it;
    }


    /**
     * Return the next field
     * 
     * @return next stored next value
     */
    public Link next() {
        return n;
    }


    /**
     * Set the next field
     * 
     * @param inn
     *            desired next value
     * @return next value
     */
    public Link setNext(Link inn) {
        n = inn;
        return inn;
    }

}
