package tdd_by_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = Money.doller(5);
		assertEquals(Money.doller(10), five.times(2));
		assertEquals(Money.doller(15), five.times(3));		
	}

	@Test
	public void testEquality() {
		assertTrue(Money.doller(5).equals(Money.doller(5)));
		assertFalse(Money.doller(5).equals(Money.doller(6)));		
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.doller(5)));		
	}

	@Test
	public void testFrancMultiplication() {
		Franc five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));		
	}
}

