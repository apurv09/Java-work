
public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount sbAccount= new BankAccount(1001,"abc",342542.2452f);
		sbAccount.showData();
		sbAccount.withdraw(50000);
		sbAccount.showBalance();
		System.out.println(BankAccount.bankName);
	}

}
