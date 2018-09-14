package exercisesLab3;

import java.util.Scanner;

public class AccountTest extends Account {
	
	public AccountTest(double initialbalance) {
		super(initialbalance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) { //4
		Account account1 = new Account(7.99);
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.println("adding -$1.14 to account1 balance");
		account1.credit(-1.14);
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
	} 
}

/*
 * 
	

	
	public static void main(String args[]) { //4
		Account account1 = new Account(7.99);
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.println("adding -$1.14 to account1 balance");
		account1.credit(-1.14);
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
	} 
 */
