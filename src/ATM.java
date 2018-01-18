

public class ATM {
	
	private String userName;
	private String userAccount;
	private double balance;
	private int pin;
	private double withdraw = 0;
	private double deposit = 0;	
	
	public ATM(){}
	
	public ATM(String name, String acc, double balance, int pin){
		
		this.userName = name;
		this.userAccount = acc;
		this.balance = balance;
		this.pin= pin;
		
	}
	
	public String getUserName(){
		return userName;
	}
	
	public int getPin(){
		
		return pin;
	}
	
	public String getUserAccount(){
		return userAccount;
	}
	
	public void setPin(int pin){
		this.pin = pin;
	}
	
	public void setUserName(String name){
		this.userName = name;
	}
	
	public void setUserAccount(String acc){
		this.userAccount = acc;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setDeposit(double deposit){
		this.deposit = deposit;
	}
	
	public void setWithdraw(double withdraw){
		this.withdraw = withdraw;
	}
	
	public double getWithdraw(){
		return withdraw;
	}
	
	public double getDeposit(){
		return deposit;
	}

	public double Balance(double withdraw, double deposit){
		if(this.withdraw == 0){
			 setBalance(balance += deposit);
			 
		}
		
		if(this.deposit == 0){
			setBalance(balance -= withdraw);
			
		}
		
		if(this.withdraw == withdraw && this.deposit == deposit){
			setBalance(balance += (deposit - withdraw));
		}
		setWithdraw(withdraw);
		setDeposit(deposit);
		
		return balance;
		
		
	}



}
