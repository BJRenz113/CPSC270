import java.lang.annotation.*;

/**
 * State file for BST
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGStates {

    @SuppressWarnings("javadoc")
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface State {

        public String state() default "";
    }

    /**
     * state="<b,a,c>"
     * 
     * @return state="<b,a,c>"
     */
    @State(state = "<b,a,c>")
    public static BstADT state0() {
        BstADT o = new BstIMP();
        o.insert("b");
        o.insert("a");
        o.insert("c");
        return o;
    }


    /**
     * state="<b,c>"
     * 
     * @return state="<b,c>"
     */
    @State(state = "<b,c>")
    public static BstADT state1() {
        BstADT o = new BstIMP();
        o.insert("b");
        o.insert("c");
        return o;
    }


    /**
     * state="<a,c>"state="<a,c>"
     * 
     * @return state="<a,c>"
     */
    @State(state = "<a,c>")
    public static BstADT state2() {
        BstADT o = new BstIMP();
        o.insert("a");
        o.insert("c");
        return o;
    }


    /**
     *  state="<a,b>"
     * 
     * @return state="<a,b>"
     */
    @State(state = "<a,b>")
    public static BstADT state3() {
        BstADT o = new BstIMP();
        o.insert("a");
        o.insert("b");
        return o;
    }


    /**
     * state="<>"
     * 
     * @return state="<>"
     */
    @State(state = "<>")
    public static BstADT state4() {
        BstADT o = new BstIMP();
        return o;
    }


    /**
     * state="<b,a,c,d>"
     * 
     * @return state="<b,a,c,d>"
     */
    @State(state = "<b,a,c,d>")
    public static BstADT state5() {
        BstADT o = new BstIMP();
        o.insert("b");
        o.insert("a");
        o.insert("c");
        o.insert("d");
        return o;
    }


    /**
     * state="<y,x,z>"
     * 
     * @return state="<y,x,z>"
     */
    @State(state = "<y,x,z>")
    public static BstADT state6() {
        BstADT o = new BstIMP();
        o.insert("y");
        o.insert("x");
        o.insert("z");
        return o;
    }


    /**
     * state="<y,x,d,z>"
     * 
     * @return state="<y,x,d,z>"
     */
    @State(state = "<y,x,d,z>")
    public static BstADT state7() {
        BstADT o = new BstIMP();
        o.insert("y");
        o.insert("x");
        o.insert("d");
        o.insert("z");
        return o;
    }


    /**
     * state="<a>"
     * 
     * @return state="<a>"
     */
    @State(state = "<a>")
    public static BstADT state8() {
        BstADT o = new BstIMP();
        o.insert("a");
        return o;
    }


    /**
     *  state="<a,b,c>"
     * 
     * @return state="<a,b,c>"
     */
    @State(state = "<a,b,c>")
    public static BstADT state9() {
        BstADT o = new BstIMP();
        o.insert("a");
        o.insert("b");
        o.insert("c");
        return o;
    }


    /**
     * state="<x,y,z>"
     * 
     * @return state="<x,y,z>"
     */
    @State(state = "<x,y,z>")
    public static BstADT state10() {
        BstADT o = new BstIMP();
        o.insert("x");
        o.insert("y");
        o.insert("z");
        return o;
    }
}
