import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * State test for method Insert
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGInsertStateTests {

    /** Exception */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <b,a,c>.insert("a") -> <b,a,c>
     */
    @Test
    public void dupe1() {
        BstADT o = BstAdtASGStates.state0();
        o.insert("a");
        String actual = o.toString();
        String expected = "<b,a,c>";
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.insert("b") -> <b,a,c>
     */
    @Test
    public void dupe2() {
        BstADT o = BstAdtASGStates.state0();
        o.insert("b");
        String actual = o.toString();
        String expected = "<b,a,c>";
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.insert("c") -> <b,a,c>
     */
    @Test
    public void dupe3() {
        BstADT o = BstAdtASGStates.state0();
        o.insert("c");
        String actual = o.toString();
        String expected = "<b,a,c>";
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.insert("d") -> <b,a,c,d>
     */
    @Test
    public void base1() {
        BstADT o = BstAdtASGStates.state0();
        o.insert("d");
        String actual = o.toString();
        String expected = "<b,a,c,d>";
        assertEquals(expected, actual);
    }


    /**
     * <y,x,z>.insert("d") -> <y,x,d,z>
     */
    @Test
    public void base2() {
        BstADT o = BstAdtASGStates.state6();
        o.insert("d");
        String actual = o.toString();
        String expected = "<y,x,d,z>";
        assertEquals(expected, actual);
    }
}
