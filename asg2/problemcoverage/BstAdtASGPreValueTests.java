import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method Pre
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGPreValueTests {

    /** Exceptions */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <>.pre() == ""
     */
    @Test
    public void empty() {
        BstADT o = BstAdtASGStates.state4();
        String actual = o.pre();
        String expected = "";
        assertEquals(expected, actual);
    }


    /**
     * <a,b,c>.pre() == "b,a,c"
     */
    @Test
    public void base1() {
        BstADT o = BstAdtASGStates.state9();
        String actual = o.pre();
        String expected = "b,a,c";
        assertEquals(expected, actual);
    }


    /**
     * <x,y,z>.pre() == "y,x,z"
     */
    @Test
    public void base2() {
        BstADT o = BstAdtASGStates.state10();
        String actual = o.pre();
        String expected = "y,x,z";
        assertEquals(expected, actual);
    }
}
