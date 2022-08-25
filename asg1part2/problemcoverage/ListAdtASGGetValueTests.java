import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 * Value tests for method get
 *  @author Brennan Renz
 *  @version 3/26
 */
public class ListAdtASGGetValueTests {

	/** thrown is throwing */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <|a,b,c>.get() == a
	 */
	@Test
	public void basicGet1() {
		ListADT o = ListAdtASGStates.state0();
		char actual = o.get();
		char expected = 'a';
		assertEquals(expected, actual);
	}

	/**
	 * <a|b,c>.get() == b
	 */
	@Test
	public void basicGet2() {
		ListADT o = ListAdtASGStates.state1();
		char actual = o.get();
		char expected = 'b';
		assertEquals(expected, actual);
	}

	/**
	 * <a,b|c>.get() == c
	 */
	@Test
	public void basicGet3() {
		ListADT o = ListAdtASGStates.state2();
		char actual = o.get();
		char expected = 'c';
		assertEquals(expected, actual);
	}
}
