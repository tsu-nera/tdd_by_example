package tdd_by_example;

abstract class Money {
	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}

	public static Doller doller(int amount) {
		return new Doller(amount);
	}

	public static Franc franc(int amount) {
		return new Franc(amount);
	}
	
	abstract Money times(int multiplier);
}

