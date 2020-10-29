package account;

public class Program {

	public static void main(String[] args) {
		var acct1 = new Savings("Primary Account");
		var acct2 = new Account("Secondary Account");
		var acct3 = new Savings("Third Account");
		acct1.deposit(500);
		if(acct1.transfer(200, acct2))
			System.out.println("Acct1 Balance is " + acct1.getBalance() + "\nAcct2 Balance is " + acct2.getBalance());
		acct1.setIntRate(.12);
		acct1.PayInterest(1);
		System.out.println("Acct1 balance after interest is " + acct1.getBalance());
	}

}
