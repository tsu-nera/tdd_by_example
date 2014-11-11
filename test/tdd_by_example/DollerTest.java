package tdd_by_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollerTest {

	@Test
	public void testMultiplication() {
		Doller five = new Doller(5);
		Doller product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
}
