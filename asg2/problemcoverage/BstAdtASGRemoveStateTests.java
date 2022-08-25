import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *  State tests for method Remove
 * 
 *  @author Brennan Renz
 *  @version 4/26
 */
public class BstAdtASGRemoveStateTests {

	/** Exceptions */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <b,a,c>.remove("a") -> <b,c>
	 */
	@Test
	public void base1() {
		BstADT o = BstAdtASGStates.state0();
		o.remove("a");
		String actual = o.toString();
		String expected = "<b,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.remove("b") -> <a,c>
	 */
	@Test
	public void base2() {
		BstADT o = BstAdtASGStates.state0();
		o.remove("b");
		String actual = o.toString();
		String expected = "<a,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.remove("c") -> <b,a>
	 */
	@Test
	public void base3() {
		BstADT o = BstAdtASGStates.state0();
		o.remove("c");
		String actual = o.toString();
		String expected = "<b,a>";
		assertEquals(expected, actual);
	}

	/**
	 * <b,a,c>.remove("d") -> <b,a,c>
	 */
	@Test
	public void notPresent() {
		BstADT o = BstAdtASGStates.state0();
		o.remove("d");
		String actual = o.toString();
		String expected = "<b,a,c>";
		assertEquals(expected, actual);
	}

	/**
	 * <>.remove("d") -> <>
	 */
	@Test
	public void empty() {
		BstADT o = BstAdtASGStates.state4();
		o.remove("d");
		String actual = o.toString();
		String expected = "<>";
		assertEquals(expected, actual);
	}
}
