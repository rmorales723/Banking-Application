package FirstBank;

public class Account {

    //Class variables
	int balance;
	int prevTransaction;
	String customerName;
	String customerId;
	
	//Class constructor
    Account(String cname, String cid){
		    customerName = cname;
		    customerId = cid;
	}
	
	//Function for depositing money
	void deposit(int amount) {
		if (amount != 0) {
		    balance = balance + amount;
			prevTransaction = amount;
		}
	}

    //Function for withdrawing money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}

    //Function calculating interest of current funds after a number of years
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, you balance will be: " + newBalance);
	}
}
