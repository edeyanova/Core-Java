package OddNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OddNumberTest {
	private odd_n a;

	@Before
	public void setUp() throws Exception {
		this.a = new odd_n();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//assertTrue(a.isOdd(3), true);
		assertEquals(1,a.doubleFac(1));
	}


}
