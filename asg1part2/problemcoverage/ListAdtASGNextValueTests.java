import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method next
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGNextValueTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b|c>.next() == true
     */
    @Test
    public void possibleNext() {
        ListADT o = ListAdtASGStates.state2();
        boolean actual = o.next();
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <a,b,c|>.next() == false
     */
    @Test
    public void impossibleNext() {
        ListADT o = ListAdtASGStates.state3();
        boolean actual = o.next();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
