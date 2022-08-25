import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Exceptions tests for the get method
 * 
 * @author Brennan Renz
 * @version 3/26
 */
public class ListAdtASGGetExceptionsTests {

    /** thrown is throwing. */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <|>.get() !! NoSuchElementException
     * 
     * @throws NoSuchElementException
     *             for value
     */
    @Test
    public void nullTest()
        throws NoSuchElementException {
        try {
            ListADT o = ListAdtASGStates.state4();
            o.get();
        }
        catch (Exception e) {
            String expectedMessage = "good";
            assertEquals(expectedMessage, e.getMessage());
        }
    }


    /**
     * <a,b,c|>.get() !! NoSuchElementException
     * 
     * @throws NoSuchElementException
     *             for value
     */
    @Test
    public void notPossible()
        throws NoSuchElementException {
        try {
            ListADT o = ListAdtASGStates.state3();
            o.get();
        }
        catch (Exception e) {
            String expectedMessage = "good";
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
