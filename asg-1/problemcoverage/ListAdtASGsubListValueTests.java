import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListAdtASGsubListValueTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <'a','b'|'c','d'>.subList(1, 3) == <|'b','c'>
	 */
	@Test
	public void basicSubList() {
		ListADT o = ListAdtASGStates.state8();
		ListADT actual = o.subList(1, 3);
		ListADT expected = <|'b','c'>;
		assertEquals(expected, actual);
	}

	/**
	 * <'w'|,'x','y','z'>.subList(1, 3) == <|'x','y'>
	 */
	@Test
	public void basicSubList2() {
		ListADT o = ListAdtASGStates.state9();
		ListADT actual = o.subList(1, 3);
		ListADT expected = <|'x','y'>;
		assertEquals(expected, actual);
	}
}
