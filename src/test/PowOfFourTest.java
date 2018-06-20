package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PowOfFour;

public class PowOfFourTest {

	@Test
	public void testPowfour() {
		assertEquals(new String("true"),PowOfFour.powfour(64));
		assertEquals(new String("false"),PowOfFour.powfour(12));
		assertEquals(new String("Invalid input"),PowOfFour.powfour("hjghjh"));
	}

}
