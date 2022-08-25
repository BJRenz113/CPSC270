import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method Find
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGFindValueTests {

    /** Exception */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <b,a,c>.find("a") == true
     */
    @Test
    public void base1() {
        BstADT o = BstAdtASGStates.state0();
        boolean actual = o.find("a");
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.find("b") == true
     */
    @Test
    public void base2() {
        BstADT o = BstAdtASGStates.state0();
        boolean actual = o.find("b");
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.find("c") == true
     */
    @Test
    public void base3() {
        BstADT o = BstAdtASGStates.state0();
        boolean actual = o.find("c");
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <b,a,c>.find("d") == false
     */
    @Test
    public void failToFind() {
        BstADT o = BstAdtASGStates.state0();
        boolean actual = o.find("d");
        boolean expected = false;
        assertEquals(expected, actual);
    }


    /**
     * <>.find("a") == false
     */
    @Test
    public void emptyFail() {
        BstADT o = BstAdtASGStates.state4();
        boolean actual = o.find("a");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
