import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * State tests for method next
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGNextStateTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <|a,b,c>.next() -> <a|b,c>
     */
    @Test
    public void basicNext1() {
        ListADT o = ListAdtASGStates.state0();
        o.next();
        String actual = o.toString();
        String expected = "<a|b,c>";
        assertEquals(expected, actual);
    }


    /**
     * <a|b,c>.next() -> <a,b|c>
     */
    @Test
    public void basicNext2() {
        ListADT o = ListAdtASGStates.state1();
        o.next();
        String actual = o.toString();
        String expected = "<a,b|c>";
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.next() -> <a,b,c|>
     */
    @Test
    public void basicNext3() {
        ListADT o = ListAdtASGStates.state2();
        o.next();
        String actual = o.toString();
        String expected = "<a,b,c|>";
        assertEquals(expected, actual);
    }
}
