import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGnextStateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.next() -> <'a','b','c'|>
	 */
	@Test
	public void basicNext() {
		ListADT o = ListAdtASGStates.state4();
		o.next();
		String actual = o.toString();
		String expected = "<'a','b','c'|>";
		assertEquals(expected, actual);
	}
}
