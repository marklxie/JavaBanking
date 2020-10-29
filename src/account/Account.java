package account;

public class Account {
	private int id;
	private static int nextId = 1;
	private String description;
	private double balance;
	
	public int getId() {return id;};
	private void setId(int id) { this.id = id;}
	
	public String getDescription() {return description;}
	public void setDescription(String description){ this.description = description;}
	public double getBalance() {return balance;}
	private void setBalance(double amount) {this.balance = amount;}
	public Account(int id, String description, double balance) {
		
	}
	public Account() {
		this.setId(Account.nextId++);
		this.setDescription("New Account");
		this.setBalance(0);
	}
	public Account(String description) {
		this();
		this.setDescription(description);
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			return false;
		}
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= 0) {
			return false;
		}
		if(amount > this.getBalance()) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public boolean transfer(double amount, Account toAccount) {
		if(this.withdraw(amount)) {
			toAccount.deposit(amount);
			return true;
		}
		return false;
	}
	

}
