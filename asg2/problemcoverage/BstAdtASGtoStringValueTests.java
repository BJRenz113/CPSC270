import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value test for method toString()
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGtoStringValueTests {

    /** Exception */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <b,a,c>.toString() == "<b,a,c>"
     */
    @Test
    public void base1() {
        BstADT o = BstAdtASGStates.state0();
        String actual = o.toString();
        String expected = "<b,a,c>";
        assertEquals(expected, actual);
    }


    /**
     * <a,b>.toString() == "<a,b>"
     */
    @Test
    public void base2() {
        BstADT o = BstAdtASGStates.state3();
        String actual = o.toString();
        String expected = "<a,b>";
        assertEquals(expected, actual);
    }


    /**
     * <a>.toString() == "<a>"
     */
    @Test
    public void base3() {
        BstADT o = BstAdtASGStates.state8();
        String actual = o.toString();
        String expected = "<a>";
        assertEquals(expected, actual);
    }


    /**
     * <>.toString() == "<>"
     */
    @Test
    public void empty() {
        BstADT o = BstAdtASGStates.state4();
        String actual = o.toString();
        String expected = "<>";
        assertEquals(expected, actual);
    }
}
