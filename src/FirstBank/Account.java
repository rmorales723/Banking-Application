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
}
