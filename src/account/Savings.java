package account;

public class Savings extends Account {
	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		if(intRate <0) {
			return;
		}
		this.intRate = intRate;
	}
	public double PayInterest(int months) {
		var interest = this.getBalance() * this.intRate / 12 * months;
		this.deposit(interest);
		return interest;
	}
	private double intRate = 0.01;
	public Savings() {
		super();
	}
	public Savings(String description) {
		super(description);
	}
}
