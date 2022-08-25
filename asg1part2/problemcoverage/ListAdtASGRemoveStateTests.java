import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 *  State tests for method remove
 * 
 *  @author Brennan Renz
 *  @version 3/26
 */
public class ListAdtASGRemoveStateTests {

	/** thrown is throwing. */
	@SuppressWarnings("deprecation")
    @Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <a|b>.remove() -> <a|>
	 */
	@Test
	public void basicRemove1() {
		ListADT o = ListAdtASGStates.state7();
		o.remove();
		String actual = o.toString();
		String expected = "<a|>";
		assertEquals(expected, actual);
	}

	/**
	 * <|a,b>.remove() -> <|b>
	 */
	@Test
	public void basicRemove2() {
		ListADT o = ListAdtASGStates.state9();
		o.remove();
		String actual = o.toString();
		String expected = "<|b>";
		assertEquals(expected, actual);
	}

	/**
	 * <a,b|>.remove() -> <a,b|>
	 */
	@Test
	public void impossibleRemove() {
		ListADT o = ListAdtASGStates.state11();
		o.remove();
		String actual = o.toString();
		String expected = "<a,b|>";
		assertEquals(expected, actual);
	}
}
