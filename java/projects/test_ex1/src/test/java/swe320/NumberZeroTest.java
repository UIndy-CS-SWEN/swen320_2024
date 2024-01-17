package swe320;


import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NumberZeroTest {

	@Test 
	public void nonZeroFirstElement()  {
	      int arr[] = {2, 7, 0};
	      assertEquals(1, NumberZero.countZero(arr), "When the first element is not zero");
	}
	//this test fails!
	@Test
	void zeroFirstElement()  {
	      int arr[] = {0, 7, 2};
	      System.out.println(Arrays.toString(arr));
	      assertEquals(1, NumberZero.countZero(arr), "When the first element is zero");
	}

}
