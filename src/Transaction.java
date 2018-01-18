
import java.util.Date;

public class Transaction extends ATM{
	
	private String summary;
	private Date TimeStamp;
	
	public Transaction(){
		this.TimeStamp = new Date();
	}
	
	public Transaction(String name, String acc, double balance, int pin, String sum){
		super(name, acc, balance, pin);
		this.summary = sum;
	}
	
	public double Balance(double balance){
		return balance;
	}
	
	public String getSummary(){
		return " /nDate: " + TimeStamp + " /nBalance: " + getBalance();
	}
	
	public String toString(){
		return " \nSummary of your account\n\t" + summary;
	}
}
