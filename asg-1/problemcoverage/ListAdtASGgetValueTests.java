import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGgetValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.get() == 'c'
	 */
	@Test
	public void basicGet() {
		ListADT o = ListAdtASGStates.state4();
		char actual = o.get();
		char expected = 'c';
		assertEquals(expected, actual);
	}
}
