package test;
import main.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentGradesTest {

	/*@Test
	public void testStudgrades() {
		assertEquals()
	}*/

	@Test
	public void testAvg() {
		int[] check = {86,65,98,77};
		float act=StudentGrades.avg(check),expec=(float) 81.5;
		System.out.println(act);
		assertEquals(expec,act,0);
	}

	@Test
	public void testMax() {
		int[] check = {86,65,98,77};
		assertEquals(98,StudentGrades.max(check));
	}

	@Test
	public void testMin() {
			int[] check = {86,65,98,77};
			assertEquals(65,StudentGrades.min(check));
		}
	

}
