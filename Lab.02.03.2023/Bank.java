package Lab;
	 class Customer {
	    private int accountNumber;
	    private String accountName;
	    private double accountBalance;
	    
	    public void createAccount(int accNumber, String accName, double accBalance) {
	        accountNumber = accNumber;
	        accountName = accName;
	        accountBalance = accBalance;
	    }
	    
	    public void setAmount(double amount) {
	        accountBalance += amount;
	    }
	    
	    public void getAmount() {
	        System.out.println("Account Name: " + accountName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Balance: " + accountBalance);
	    }
	    
	    public void withDrawAmount(double amount) {

	            System.out.println("Withdrawal Amount: " + amount);
	            getAmount();
	        }
	    }

	public class Bank {
	    public static void main(String[] args) {
	        Customer john = new Customer();
	        john.createAccount(1001, "Nikhil", 3000.0);
	        john.withDrawAmount(2000.0);
	        
	        Customer jane = new Customer();
	        jane.createAccount(1002, "Parry", 10000.0);
	        jane.withDrawAmount(5000.0);
	    }
	}


