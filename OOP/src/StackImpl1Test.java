import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StackImpl1Test {
	  private Stack<Integer> stack;

	@Before
	public void setUp() throws Exception {
		stack = new StackImpl1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		stack.push(7);
		stack.push(77);
		assertEquals(2, stack.size());
		assertEquals((Integer) 77, stack.pop());
		assertEquals((Integer) 7, stack.peek());
	}

}
