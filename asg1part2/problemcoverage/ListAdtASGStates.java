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
 * 
 * Tracks state of problem instances
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
        o.curr = 0;
        o.listSize = 3;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';
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
        o.curr = 1;
        o.listSize = 3;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';
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
        o.curr = 2;
        o.listSize = 3;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';
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
        o.curr = 3;
        o.listSize = 3;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';

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
        o.curr = 0;
        o.listSize = 0;
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
        o.curr = 2;
        o.listSize = 4;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';
        o.listArray[3] = 'd';
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
        o.curr = 1;
        o.listSize = 4;
        o.listArray[0] = 'w';
        o.listArray[1] = 'x';
        o.listArray[2] = 'y';
        o.listArray[3] = 'z';
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
        o.curr = 1;
        o.listSize = 2;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
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
        o.curr = 0;
        o.listSize = 2;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
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
        o.curr = 2;
        o.listSize = 2;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
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
        o.curr = 0;
        o.listSize = 4;
        o.listArray[0] = 'a';
        o.listArray[1] = 'b';
        o.listArray[2] = 'c';
        o.listArray[3] = 'd';
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
        o.curr = 2;
        o.listSize = 3;
        o.listArray[0] = 'a';
        o.listArray[1] = 'd';
        o.listArray[2] = 'c';
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
        o.curr = 2;
        o.listSize = 3;
        o.listArray[0] = 'b';
        o.listArray[1] = 'c';
        o.listArray[2] = 'a';
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
        o.curr = 0;
        o.listSize = 2;
        o.listArray[0] = 'b';
        o.listArray[1] = 'c';
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
        o.curr = 0;
        o.listSize = 2;
        o.listArray[0] = 'x';
        o.listArray[1] = 'y';
        return o;
    }
}

