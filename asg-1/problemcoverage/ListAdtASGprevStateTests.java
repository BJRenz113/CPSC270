import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGprevStateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.prev() -> <'a'|'b','c'>
	 */
	@Test
	public void basicPrev() {
		ListADT o = ListAdtASGStates.state4();
		o.prev();
		String actual = o.toString();
		String expected = "<'a'|'b','c'>";
		assertEquals(expected, actual);
	}
}
