package test;
import main.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberVariablesTest {

	@Test
	public void testReturning() {
		assertEquals(new String[]{"Aakash","22","73283.98"},MemberVariables.returning("Aakash",22,73283.98));
	
	}

}
