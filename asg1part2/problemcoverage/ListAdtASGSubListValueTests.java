import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Value tests for method sublist
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGSubListValueTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <a,b|c,d>.subList(1, 3) == x
     */
    @Test
    public void basicSubList() {
        ListADT o = ListAdtASGStates.state5();
        ListADT actual = o.subList(1, 3);
        ListADT x = ListAdtASGStates.state15();
        ListADT expected = x;
        assertEquals(expected, actual);
    }


    /**
     * <w|x,y,z>.subList(1, 3) == x
     */
    @Test
    public void basicSubList2() {
        ListADT o = ListAdtASGStates.state6();
        ListADT actual = o.subList(1, 3);
        ListADT x = ListAdtASGStates.state16();
        ListADT expected = x;
        assertEquals(expected, actual);
    }
}
