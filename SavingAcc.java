package theme_19;

import theme_14.Account;

public class SavingAcc extends Account {
	
		
		public void withdraw(double draw) {
			balance -= draw;
			}
			
		
	
	public String toString () {
		return super.toString () + "Saving acc";
		}

}
