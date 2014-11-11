package tdd_by_example;

public class Doller extends Money {

	public Doller(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Doller(amount * multiplier);
	}

}

