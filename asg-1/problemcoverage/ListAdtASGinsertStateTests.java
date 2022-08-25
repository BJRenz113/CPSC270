import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGinsertStateTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.insert('d') -> <'a','b','d','c'>
	 */
	@Test
	public void basicInsert() {
		ListADT o = ListAdtASGStates.state4();
		o.insert('d');
		String actual = o.toString();
		String expected = "<'a','b','d','c'>";
		assertEquals(expected, actual);
	}

	/**
	 * <'a','b','c'|>.insert('d') -> <'a','b','c'|>
	 */
	@Test
	public void impossibleInsert() {
		ListADT o = ListAdtASGStates.state3();
		o.insert('d');
		String actual = o.toString();
		String expected = "<'a','b','c'|>";
		assertEquals(expected, actual);
	}
}
