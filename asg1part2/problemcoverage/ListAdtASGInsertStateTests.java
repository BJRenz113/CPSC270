import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * State tests for the insert method
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGInsertStateTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b|c>.insert('d') -> <a,b|d,c>
     */
    @Test
    public void basicInsert() {
        ListADT o = ListAdtASGStates.state2();
        o.insert('d');
        String actual = o.toString();
        String expected = "<a,b|d,c>";
        assertEquals(expected, actual);
    }


    /**
     * <|a,b,c>.insert('d') -> <|d,a,b,c>
     */
    @Test
    public void frontInsert() {
        ListADT o = ListAdtASGStates.state0();
        o.insert('d');
        String actual = o.toString();
        String expected = "<|d,a,b,c>";
        assertEquals(expected, actual);
    }


    /**
     * <a,b,c|>.insert('d') -> <a,b,c|>
     */
    @Test
    public void lastInsert() {
        ListADT o = ListAdtASGStates.state3();
        o.insert('d');
        String actual = o.toString();
        String expected = "<a,b,c|d>";
        assertEquals(expected, actual);
    }
}
