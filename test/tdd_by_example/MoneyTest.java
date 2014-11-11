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
		assertFalse(Money.franc(5).equals(Money.doller(5)));		
	}

	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));		
	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Money.doller(1).currency());
		assertEquals("CHF", Money.franc(1).currency());		
	}

	@Test
	public void testDifferentClssEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}

	@Test
	public void testSimpleAddition() {
		Money five = Money.doller(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.doller(10), reduced);
	}

	@Test
	public void testPlusReturnsSum() {
		Money five = Money.doller(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);		
	}

	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.doller(3), Money.doller(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.doller(7), result);
	}

	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.doller(1), "USD");
		assertEquals(Money.doller(1), result);
	}
	
}

