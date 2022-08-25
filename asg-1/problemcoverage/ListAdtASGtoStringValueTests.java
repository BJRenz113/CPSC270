import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGtoStringValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.toString() == "<a,b|c>"
	 */
	@Test
	public void basicToString() {
		ListADT o = ListAdtASGStates.state4();
		String actual = o.toString();
		String expected = "<a,b|c>";
		assertEquals(expected, actual);
	}

	/**
	 * <|>.toString() == "<|>"
	 */
	@Test
	public void emptyToString() {
		ListADT o = ListAdtASGStates.state5();
		String actual = o.toString();
		String expected = "<|>";
		assertEquals(expected, actual);
	}
}
