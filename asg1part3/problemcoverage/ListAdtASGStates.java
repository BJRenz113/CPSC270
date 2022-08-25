import java.lang.annotation.*;

/**
 * Contains all problem instance states used in testing
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGStates {

    /**
     * Testing states
     * 
     * @author Brennan Renz
     * @version 3/26
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface State {

        /**
         * Tracks state of problem instances
         * 
         * @return state objects
         */
        public String state() default "";
    }

    /**
     * Creates listADT state
     * 
     * @return <|a,b,c>
     */
    @State(state = "<|a,b,c>")
    public static ListADT state0() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('b');
        o.insert('a');
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a|b,c>
     */

    @State(state = "<a|b,c>")
    public static ListADT state1() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('b');
        o.insert('a');

        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a,b|c>
     */
    @State(state = "<a,b|c>")
    public static ListADT state2() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('b');
        o.insert('a');

        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a,b,c|>
     */
    @State(state = "<a,b,c|>")
    public static ListADT state3() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('b');
        o.insert('a');

        o.next();
        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <|>
     */
    @State(state = "<|>")
    public static ListADT state4() {
        ListIMP o = new ListIMP();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a,b|c,d>
     */
    @State(state = "<a,b|c,d>")
    public static ListADT state5() {
        ListIMP o = new ListIMP();
        o.insert('d');
        o.insert('c');
        o.insert('b');
        o.insert('a');
        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <w|x,y,z>
     */
    @State(state = "<w|x,y,z>")
    public static ListADT state6() {
        ListIMP o = new ListIMP();
        o.insert('z');
        o.insert('y');
        o.insert('x');
        o.insert('w');
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a|b>
     */
    @State(state = "<a|b>")
    public static ListADT state7() {
        ListIMP o = new ListIMP();
        o.insert('b');
        o.insert('a');
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <|a,b>
     */
    @State(state = "<|a,b>")
    public static ListADT state9() {
        ListIMP o = new ListIMP();
        o.insert('b');
        o.insert('a');
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a,b|>
     */
    @State(state = "<a,b|>")
    public static ListADT state11() {
        ListIMP o = new ListIMP();
        o.insert('b');
        o.insert('a');
        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <|a,b,c,d>
     */
    @State(state = "<|a,b,c,d>")
    public static ListADT state12() {
        ListIMP o = new ListIMP();
        o.insert('d');
        o.insert('c');
        o.insert('b');
        o.insert('a');
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <a,d|c>
     */
    @State(state = "<a,d|c>")
    public static ListADT state13() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('d');
        o.insert('a');
        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <b,c|a>
     */
    @State(state = "<b,c|a>")
    public static ListADT state14() {
        ListIMP o = new ListIMP();
        o.insert('a');
        o.insert('c');
        o.insert('b');
        o.next();
        o.next();
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <|b,c>
     */
    @State(state = "<|b,c>")
    public static ListADT state15() {
        ListIMP o = new ListIMP();
        o.insert('c');
        o.insert('b');
        return o;
    }


    /**
     * Creates listADT state
     * 
     * @return <|x,y>
     */
    @State(state = "<|x,y>")
    public static ListADT state16() {
        ListIMP o = new ListIMP();
        o.insert('y');
        o.insert('x');
        return o;
    }
}
