import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGnextValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b','c'|>.next() == false
	 */
	@Test
	public void impossibleNext() {
		ListADT o = ListAdtASGStates.state3();
		boolean actual = o.next();
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
