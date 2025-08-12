//Write a program to display how a static variable is initialized and accessed in a class.

class Account {
	static int count;

	static {
		count = 100;
		System.out.println("Static block executed. Static variable count initialized to " + count);
	}

	
	Account() {
		count++;
		System.out.println("Account created. Current count: " + count);
	}

	
	static void displayCount() {
		System.out.println("Static variable count accessed via static method: " + count);
	}
}

public class Init_acc {
	public static void main(String[] args) {
		
		System.out.println("Accessing static variable directly: " + Account.count);
		
		Account a1 = new Account();
		Account a2 = new Account();
		
		Account.displayCount();
	}
}

