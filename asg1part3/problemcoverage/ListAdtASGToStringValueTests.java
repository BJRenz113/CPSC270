import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method toString
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGToStringValueTests {

    /** thrown throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b|c>.toString() == "<a,b|c>"
     */
    @Test
    public void basicToString1() {
        ListADT o = ListAdtASGStates.state2();
        String actual = o.toString();
        String expected = "<a,b|c>";
        assertEquals(expected, actual);
    }


    /**
     * <|a,b>.toString() == "<|a,b>"
     */
    @Test
    public void basicToString2() {
        ListADT o = ListAdtASGStates.state9();
        String actual = o.toString();
        String expected = "<|a,b>";
        assertEquals(expected, actual);
    }


    /**
     * <a,b,c|>.toString() == "<a,b,c|>"
     */
    @Test
    public void basicToString3() {
        ListADT o = ListAdtASGStates.state3();
        String actual = o.toString();
        String expected = "<a,b,c|>";
        assertEquals(expected, actual);
    }


    /**
     * <|>.toString() == "<|>"
     */
    @Test
    public void emptyToString() {
        ListADT o = ListAdtASGStates.state4();
        String actual = o.toString();
        String expected = "<|>";
        assertEquals(expected, actual);
    }
}
