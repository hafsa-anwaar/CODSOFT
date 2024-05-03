import java.util.Scanner;
class BankAccount {
    public double balance;//variable that can be only accessed by this class
public BankAccount(double initialBalance) {
   //constructor/method
	this.balance = initialBalance;  //this refers to the current balance
    }

    public double getBalance() {//method created to return the value of balance
        return balance;
    }
}
public class ATM {
	 static Scanner sc=new Scanner(System.in);
	//BankAccount class object is created in ATM class to access it
	static BankAccount account = new BankAccount(70000.0);//in PKR (pakistani rupees)
	public static void withdrawOfamount(Scanner sc)
	  {	System.out.print("Enter the amount to withdraw: ");
		  int withdraw= sc.nextInt();
		  if(account.getBalance() >= withdraw)  
	      {  
	          //remove the withdrawl amount from the total balance  
	          account.balance-=withdraw;  
	          System.out.println("Please collect your money"); 
	          System.out.print("Updated balance: "+account.getBalance());
	          //account is an object of the class bankaccount through which we are accessing getblance method
	      }  
	      else  
	      {  
	          //show custom error message   
	          System.out.println("Insufficient Balance");  
	          System.out.println("Transaction Failed");
	          System.out.print("Your balance: "+account.getBalance());
	      }    
	  }
	public static void depositOfamount(Scanner sc)
	  {
			System.out.print("Enter the amount to deposit: ");
			int deposit= sc.nextInt();
		    if(deposit >0)  
		      {  
		          account.balance+=deposit;  
		          System.out.println("Transaction Successful");
		          System.out.print("Your balance: "+account.getBalance());
		      }  
		      else  
		      {  
		          //show custom error message   
		          System.out.println("Insufficient Balance deposited");  
		          System.out.println("Transaction Failed");
		          System.out.print("Your balance: "+account.getBalance());
		      }    
	  }
	public static void checkbalance()
	  {
			System.out.print("Your total balance is :"+account.getBalance());
	  }
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM ");	
		System.out.print("Enter your username: ");
		String name=sc.nextLine();
        System.out.println("Hello"+name);
		System.out.print("Enter your PIN: ");
        int pin=sc.nextInt();
        if(pin==12345) 
        	//username and pin must be correct
        {
		
		System.out.println("Choose 1 for WITHDRAW");
		System.out.println("Choose 2 for DEPOSIT");
		System.out.println("Choose 3 for CHECK BALANCE");
		System.out.println("Choose 4 for EXIT");
		System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			withdrawOfamount(sc);
		break;
		case 2:
			depositOfamount(sc);
			break;
		case 3:
			checkbalance();
			break;
		case 4:
			System.out.println("Succesfully Exited");
			
		}
		}
	else
	{
		System.out.print("Invalid PIN");
	}
	sc.close();
}
	}



