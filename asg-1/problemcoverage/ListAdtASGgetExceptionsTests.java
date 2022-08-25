import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.NoSuchElementException;

public class ListAdtASGgetExceptionsTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * <|>.get() !! NoSuchElementException
	 */
	@Test
	public void nul() throws NoSuchElementException {
		ListADT o = ListAdtASGStates.state5();
		thrown.expect(NoSuchElementException.class);
		o.get();
	}
}
