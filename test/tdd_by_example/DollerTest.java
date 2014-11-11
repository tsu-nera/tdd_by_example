package tdd_by_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollerTest {

	@Test
	public void testMultiplication() {
		Doller five = new Doller(5);
		assertEquals(new Doller(10), five.times(2));
		assertEquals(new Doller(15), five.times(3));		
	}

	@Test
	public void testEquality() {
		assertTrue(new Doller(5).equals(new Doller(5)));
	}
}

