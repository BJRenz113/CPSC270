import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method prev
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGPrevValueTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b,c|>.prev() == true
     */
    @Test
    public void possiblePrev() {
        ListADT o = ListAdtASGStates.state3();
        boolean actual = o.prev();
        boolean expected = true;
        assertEquals(expected, actual);
    }


    /**
     * <|a,b,c>.prev() == false
     */
    @Test
    public void impossiblePrev() {
        ListADT o = ListAdtASGStates.state0();
        boolean actual = o.prev();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
