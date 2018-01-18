
import java.util.*;
import java.util.ArrayList;

public class Bank {
	
	private static boolean flag = false;
	private static String UserName;
	private static String AccountNo;
	private static double balance;
	private static List<ATM> accountList;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.println("Welcome to NSU");

		
		List<ATM> accountList =  new ArrayList<ATM>();
		
		while(true){
			
			
			System.out.println("1. Create Account");
			
			System.out.println("2. Delete Account");
			
			System.out.println("3. Deposit");
			
			System.out.println("4. Withdraw");
			
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice:");
			
			int choice = input.nextInt();
			
			switch(choice){
			case 1:
				input.nextLine();
			    System.out.println("Enter your name: ");
			    String UserName = input.nextLine();
			    System.out.println("Enter your Account Number: ");
			    String AccountNo = input.nextLine();
			    System.out.println("Enter balance for your Account: ");
			    double balance = input.nextDouble();
			    System.out.println("Enter pin for your Account: ");
			    int pin = input.nextInt();
			    
			    accountList.add(new ATM(UserName, AccountNo, balance, pin));
			    
			    System.out.println("User Name:" + UserName + " \nAccount No:- " + AccountNo + " \nBalance: " + balance + " \nPin:" + pin);
				break;
				
			
			case 2:
				System.out.println("Enter the account number for further operations: ");
				String delAccount = str.nextLine();
				System.out.println("Account no:- " + delAccount);
				
					
				for (ATM o : accountList){
					if(delAccount.equals(o.getUserAccount())){
						accountList.remove(o);
			      		System.out.println("Account " + delAccount + " closed.");
			      		System.out.println("Existing Customers: " + accountList);
			      		flag = true;
			      		break;
					}
					if(!flag){
						System.out.println("Account doesn't exist");
						
					}
				}
				break;										
			
			case 3:
				flag= true;
				
				while(flag==true){
					for(ATM o: accountList){
					input.nextLine();
					System.out.println("Enter your Account Number: ");
				    String account = input.nextLine();
				    System.out.println("Enter Pin: ");
				    int p = input.nextInt();
						if(( account.equals(o.getUserAccount())) && p == o.getPin()){
							System.out.println("Enter amount to Deposit: ");
						    double deposit = input.nextDouble();
						    o.Balance(0, deposit);
						    System.out.println(accountList.toString());
						    flag=false;
						}else{
							System.out.println("Credentials do not match");
						}
					}
				}
				break;
				
			case 4:
				flag= true;
				
				while(flag==true){
					for(ATM o: accountList){
					input.nextLine();
					System.out.println("Enter your Account Number: ");
				    String account = input.nextLine();
				    System.out.println("Enter Pin: ");
				    int p = input.nextInt();
						if(( account.equals(o.getUserAccount())) && p == o.getPin()){
							System.out.println("Enter amount to Withdraw: ");
						    double withdraw = input.nextDouble();
						    o.Balance(withdraw, 0);
						    System.out.println(accountList.toString());
						    flag=false;
						}else{
							System.out.println("Credentials do not match");
						}
					}
				}
				break;
			
			case 5: 
				System.out.println("You have exited the Bank");
				System.exit(0);
				break;
				
			}
			
			
		}

	}

}