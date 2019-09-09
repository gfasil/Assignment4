package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void testBinarySearch() {
		// fail("Not yet implemented");
		Problem3 b = new Problem3();
		int eop = 0;
		int op = b.binarySearch(new int[] { 1, 3, 4 }, 1);
		assertEquals(eop, op);
	}

	@Test
	public void testPalondrome() {
		// fail("Not yet implemented");
		Problem4 b = new Problem4();
		boolean eop = false;
		boolean op = b.isPalondrome("moon");
		assertEquals(eop, op);
	}

}
