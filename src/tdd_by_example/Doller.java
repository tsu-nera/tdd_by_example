package tdd_by_example;

public class Doller {

	int amount;

	public Doller(int amount) {
		this.amount = amount;
	}

	public void times(int multiplier) {
		amount = amount * multiplier;          
	}

}
