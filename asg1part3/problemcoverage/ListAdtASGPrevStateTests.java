import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * State tests for method prev
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGPrevStateTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b,c|>.prev() -> <a,b|c>
     */
    @Test
    public void basicPrev1() {
        ListADT o = ListAdtASGStates.state3();
        o.prev();
        String actual = o.toString();
        String expected = "<a,b|c>";
        assertEquals(expected, actual);
    }


    /**
     * <a,b|c>.prev() -> <a|b,c>
     */
    @Test
    public void basicPrev2() {
        ListADT o = ListAdtASGStates.state2();
        o.prev();
        String actual = o.toString();
        String expected = "<a|b,c>";
        assertEquals(expected, actual);
    }


    /**
     * <a|b,c>.prev() -> <|a,b,c>
     */
    @Test
    public void basicPrev3() {
        ListADT o = ListAdtASGStates.state1();
        o.prev();
        String actual = o.toString();
        String expected = "<|a,b,c>";
        assertEquals(expected, actual);
    }
}
