
public class BankAccount {
	int accountNo;
	String accountHolderName;
	float balance;
	static String bankName="HDFC Bank";
	
	BankAccount(int accountNo,String accountHolderName,float balance){
		this.accountNo=accountNo;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public void withdraw(float amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Amount successfully withdraw"+amount);
			System.out.println("current balance is"+balance);
		
		}else
		{
			System.out.println("no enough balance");
		}
	}
	
	public void showBalance() {
		System.out.println("Your balance is"+balance);
		
	}
	public void showData() {
		System.out.println(accountNo);
		System.out.println(accountHolderName);
		System.out.println(balance);
		
	}
}
