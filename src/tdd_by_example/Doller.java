package tdd_by_example;

public class Doller {

	int amount;

	public Doller(int amount) {
		this.amount = amount;
	}

	public Doller times(int multiplier) {
		return new Doller(amount * multiplier);
	}

	public boolean equals(Object object) {
		Doller doller = (Doller) object;
		return amount == doller.amount;
	}

	

}
