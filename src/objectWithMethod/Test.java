package objectWithMethod;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();

		Account account = t.getAccountData();
		t.printAccountDetails(account);
	}

	// =============== object as parameter ======================
	void printAccountDetails(Account ac) {

		System.out.println("Acc.Number = " + ac.getNumber());
		System.out.println("Name = " + ac.getName());
		System.out.println("Balance = " + ac.getBalance());
		System.out.println("Type = " + ac.getType());
		System.out.println("Bank  = " + ac.getBankName());
	}

	// ================= object as return type ==================

	Account getAccountData() {

		Account account = new Account();

		account.setName("Raju Gurung");
		account.setNumber(UUID.randomUUID().toString().substring(0, 8));
		account.setBalance(9000000);
		account.setType("Saving");

		return account;
	}
	

}
