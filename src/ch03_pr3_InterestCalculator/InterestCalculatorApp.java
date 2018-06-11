package ch03_pr3_InterestCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter loan amount: ");
		double loanAmt = sc.nextDouble();
		System.out.print("Enter interest rate: ");
		double interestRate = sc.nextDouble();
		System.out.println();
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMaximumFractionDigits(3);
		
		BigDecimal interestAmt = new BigDecimal(loanAmt*interestRate);
		
		System.out.println("Loan Amount: " + currencyFormat.format(loanAmt));
		System.out.println("Interest Rate: " + percentFormat.format(interestRate));
		System.out.println("Interest: " + currencyFormat.format(interestAmt.doubleValue()));
		
		System.out.println();
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		
		}
		sc.close();
		
		System.out.println("Bye!");
		
	

	}

}
