package exercisesLab3;

import java.util.Scanner;

public class Account {
	private double balance;
	
	public Account(double initialbalance) {
		if(initialbalance > 0.0) {
			balance = initialbalance;
		}
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void debit(double amount) { //¶Í¹
		if(amount > balance) {
			System.out.println("Debit amount exceeded account balanace");
		} else {
			balance = balance - amount;
		}
	}
}
