package theme_19;

import theme_14.Account;

public class CheckingAcc extends Account {
	
	private double overdraftLimit;
	
	public CheckingAcc(int id, double balance, double overdraftLimit) {
		super(id, balance);
		
		this.setOverdraftLimit(overdraftLimit);
	}
		
	

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw (double widthdraw) {
		if(super.getBalance() > this.overdraftLimit) {
			super.setBalance(super.getBalance() - widthdraw);
		}
	}
	
	public String toString () {
	return super.toString () + "Checking acc";
	}

}
