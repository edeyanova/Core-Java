import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PairTest {
	
	private Pair pair;

	@Before
	public void setUp() throws Exception {
		pair = new Pair(2,1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetfirst_member() {
		 assertEquals(2,  pair.getfirst_member());
	        assertEquals("P", (new Pair("P", 20).getfirst_member()));

	}
	@Test
	public void testgetsecond_member() {
		 assertEquals(2,  pair.getsecond_member());
	        assertEquals("P", (new Pair("P", 20).getsecond_member()));

	}
	 @Test
	    public void testToString() {
	        assertEquals("(2, 1)", pair.toString());
	        assertEquals("(ggg)", (new Pair("ggg","ggg").toString()));
	    }

	@Test
	public void test_equals(){
		//assertTrue(pair.equals(new Pair(2, 1)));
        //assertFalse(pair.equals(new Pair("2", 1)));

	}

	

}
