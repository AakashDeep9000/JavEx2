package test;
import main.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.InputReverser;

public class InputreverseTest {

	@Test
	public void testReverse() {
		assertEquals(new String[]{"madam","True"},InputReverser.reverse("madam"));
		String[] str ={"madam","True"}, str2=InputReverser.reverse("madam");
//		System.out.println(Arrays.toString(str));
//		System.out.println(Arrays.toString(str2));
		
		assertEquals(new String[] {"olleH","False"},InputReverser.reverse("Hello"));
	}

}
