import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Exceptions test for method Insert
 * 
 * @author Brennan Renz
 * @version 4/26
 */
public class BstAdtASGInsertExceptionsTests {

    /** Exception */
    @SuppressWarnings("deprecation")
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <b,a,c>.insert("null") !! NoSuchElementException
     * 
     * @throws NoSuchElementException
     *             if attempting to insert invalid string
     */
    @Test
    public void nullTest()
        throws NoSuchElementException {
        try {
            BstADT o = BstAdtASGStates.state0();
            o.insert(null);
        }
        catch (Exception e) {
            String expectedMessage = "Attempting to insert invalid char";
            assertEquals(expectedMessage, e.getMessage());

        }
    }


    /**
     * <b,a,c>.insert("<") !! NoSuchElementException
     * 
     * @throws NoSuchElementException
     *             if attempting to insert invalid string
     */
    @Test
    public void oddChar1()
        throws NoSuchElementException {
        try {
            BstADT o = BstAdtASGStates.state0();
            o.insert("<");
        }
        catch (Exception e) {
            String expectedMessage = "Attempting to insert invalid char";
            assertEquals(expectedMessage, e.getMessage());

        }

    }


    /**
     * <b,a,c>.insert(",") !! NoSuchElementException
     * 
     * @throws NoSuchElementException
     *             if attempting to insert invalid string
     */
    @Test
    public void oddChar2()
        throws NoSuchElementException {
        try {
            BstADT o = BstAdtASGStates.state0();
            o.insert(",");
        }
        catch (Exception e) {
            String expectedMessage = "Attempting to insert invalid char";
            assertEquals(expectedMessage, e.getMessage());

        }
    }
}
