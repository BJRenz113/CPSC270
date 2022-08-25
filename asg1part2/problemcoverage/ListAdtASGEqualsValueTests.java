import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method equals
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGEqualsValueTests {

    /** thrown is weird error */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b|c>.equals(x) == true
     */
    @Test
    public void equal() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state2();
        boolean actual = o.equals(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.equals(x) == false
     */
    @Test
    public void notEqualCursor() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state1();

        boolean actual = o.equals(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.equals(x) == false
     */
    @Test
    public void notEqualNum() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state9();
        boolean actual = o.equals(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.equals(x) == false
     */
    @Test
    public void notEqualNum2() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state12();
        boolean actual = o.equals(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.equals(x) == false
     */
    @Test
    public void notEqualEle() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state13();
        boolean actual = o.equals(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.equals(x) == false
     */
    @Test
    public void notEqualOrder() {
        ListADT o = ListAdtASGStates.state2();
        ListADT x = ListAdtASGStates.state14();
        boolean actual = o.equals(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
