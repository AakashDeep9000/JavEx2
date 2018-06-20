package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.EvenNumTest;

public class EvenNumTestTest {

	@Test
	public void testIsEven() {
	assertEquals(true,EvenNumTest.isEven(26));
	assertEquals(false,EvenNumTest.isEven(23));
	}

}
