package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		//DOWCASTING
	
		BusinessAccount acc4 = (BusinessAccount)acc2;
	
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan");
		}
		if( acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 =(SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		sc.close();
	}
}
