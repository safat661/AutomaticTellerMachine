

public class Account extends ATM{
	
	private double withdraw = 0;
	private double deposit = 0;
	
	public Account(){}
	
	public Account(String name, String acc, double balance, double withdraw, double deposit){
		super();
		this.withdraw = withdraw;
		this.deposit = deposit;
	}
	
	public double getWithdraw(){
		return withdraw;
	}
	
	public double getDeposit(){
		return deposit;
	}
	
	public double Balance(double balance){
		if(this.withdraw == 0){
			super.setBalance(balance += deposit);
		}
		
		if(this.deposit == 0){
			super.setBalance(balance -= withdraw);
		}
		
		if( this.withdraw == withdraw && this.deposit == deposit){
			super.setBalance(balance += (deposit-withdraw));
		}
		
		return balance;
		
	}

	
	@Override
	public String toString(){
		return super.toString() + " \nDeposit: " + deposit 
				+ " \nWithdraw: " + withdraw + " \nBalance: " + Balance(getBalance());
	}

}
