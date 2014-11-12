package tdd_by_example;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
}

