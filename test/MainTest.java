import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	public void cycleLength22() {
		int result = Main.cycleLength(22);
		assertEquals(16, result);
	}

	@Test
	public void isOdd1() {
		boolean result = Main.isOdd(1);
		assertTrue(result);
	}

	@Test
	public void isOdd0() {
		boolean result = Main.isOdd(0);
		assertFalse(result);
	}

	@Test
	public void isOdd2() {
		boolean result = Main.isOdd(2);
		assertFalse(result);
	}

	@Test
	public void isOdd3() {
		boolean result = Main.isOdd(3);
		assertTrue(result);
	}

	@Test
	public void maxCycleLength1to10() {
		int result = Main.calculateMaxCycleLength(1, 10);
		assertEquals(20, result);
	}

	@Test
	public void maxCycleLength100to200() {
		int result = Main.calculateMaxCycleLength(100, 200);
		assertEquals(125, result);
	}

	@Test
	public void maxCycleLength201to210() {
		int result = Main.calculateMaxCycleLength(201, 210);
		assertEquals(89, result);
	}

	@Test
	public void maxCycleLength900to1000() {
		int result = Main.calculateMaxCycleLength(900, 1000);
		assertEquals(174, result);
	}

	@Test
	public void maxCycleLength999999to999990() {
		int result = Main.calculateMaxCycleLength(999999, 999990);
		assertEquals(259, result);
	}

	@Test
	public void maxCycleLength10to1() {
		int result = Main.calculateMaxCycleLength(10, 1);
		assertEquals(20, result);
	}

}
