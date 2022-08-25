import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGremoveStateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a'|'b'>.remove() -> <'a'|>
	 */
	@Test
	public void basicRemove() {
		ListADT o = ListAdtASGStates.state0();
		o.remove();
		String actual = o.toString();
		String expected = "<'a'|>";
		assertEquals(expected, actual);
	}

	/**
	 * <'a','b'|>.remove() -> <'a','b'|>
	 */
	@Test
	public void impossibleRemove() {
		ListADT o = ListAdtASGStates.state2();
		o.remove();
		String actual = o.toString();
		String expected = "<'a','b'|>";
		assertEquals(expected, actual);
	}
}
