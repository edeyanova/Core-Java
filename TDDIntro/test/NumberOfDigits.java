import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NumberOfDigits {
	private GetNumberOfDigits numberofdigits;
	@Test
    public void testgetNumberOfDigits(){
		int[] a=new int[] {4,2,1,3};
    	assertEquals(4,numberofdigits.getNumberOfDigits(a));
    }

}
