package tdd_by_example;

abstract class Money {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}

	public static Doller doller(int amount) {
		return new Doller(amount, "USD");
	}

	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	abstract Money times(int multiplier);

	String currency() {
		return currency;
	}
}

