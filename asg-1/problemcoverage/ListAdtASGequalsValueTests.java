import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGequalsValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c'>.equals() == true
	 */
	@Test
	public void equal() {
		ListADT o = ListAdtASGStates.state4();
		// TODO Error getting parameters. Expected 1 got 0
		fail("Error reading Problem Instance");
	}

	/**
	 * <'a','b'|'c'>.equals() == false
	 */
	@Test
	public void notEqualCursor() {
		ListADT o = ListAdtASGStates.state4();
		// TODO Error getting parameters. Expected 1 got 0
		fail("Error reading Problem Instance");
	}

	/**
	 * <'a','b'|'c'>.equals() == false
	 */
	@Test
	public void notEqualEle() {
		ListADT o = ListAdtASGStates.state4();
		// TODO Error getting parameters. Expected 1 got 0
		fail("Error reading Problem Instance");
	}

	/**
	 * <'a','b'|'c'>.equals() == false
	 */
	@Test
	public void notEqualOrder() {
		ListADT o = ListAdtASGStates.state4();
		// TODO Error getting parameters. Expected 1 got 0
		fail("Error reading Problem Instance");
	}
}
