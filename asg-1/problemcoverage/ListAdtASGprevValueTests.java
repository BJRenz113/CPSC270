import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGprevValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <|'a','b','c'>.prev() == false
	 */
	@Test
	public void impossiblePrev() {
		ListADT o = ListAdtASGStates.state6();
		boolean actual = o.prev();
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
