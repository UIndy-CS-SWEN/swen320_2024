package swe320;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;


class NumberZeroParameterizedTest {
	
	private int inputArr[][] = {{2, 7, 0}, {0, 7, 2}}; 
	private int expectedOutputArr[] = {1, 1};

	@ParameterizedTest
	@ValueSource(ints = {0, 1}) //use index for getting input and output arrays
	public void test(int arg) {
		System.out.println("input: " + Arrays.toString(this.inputArr[arg]));
		System.out.println("output: " + this.expectedOutputArr[arg]);
		assertEquals(this.expectedOutputArr[arg], NumberZero.countZero(this.inputArr[arg]));
	}
}

