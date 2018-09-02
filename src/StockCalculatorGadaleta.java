import java.text.DecimalFormat;
import java.util.Scanner;

public class StockCalculatorGadaleta {

	/**
	 * Calculates net gain of a stock deal where the broker will receive 2%
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##"); //converts doubles or floats into strings while cutting off decimal places
		Scanner kb = new Scanner(System.in); //for scanning
		
		final float BROKER = .02f; //for the fee payed to the broker 
		
		System.out.print("Enter how many shares you bought\t");
		int amountOfShare = kb.nextInt(); //amount of stocks user purchased
		
		System.out.print("Enter the amount you paid for shares\t");
		float amountPaidPerShare = kb.nextFloat(); //amount of money each share costed
		
		System.out.print("Enter the amount you plan on selling the shares for\t");
		float amountSoldPerShare = kb.nextFloat(); //amount each share is going to be sold for
		System.out.println("\n\n\n");
		
		float net = ((amountOfShare * amountSoldPerShare) + (amountOfShare * amountSoldPerShare * BROKER)) - ((amountOfShare * amountPaidPerShare) + (amountOfShare * amountPaidPerShare * BROKER));
		//(the amount paid for + the amount paid to broker) - (the amount sold for + the amount paid to broker)
		/*the net worth of the shares
		this calculation was done separately because it is so long*/
		kb.close(); //closes the keyboard because it is no longer in use
		
		System.out.println("Stock was bought for:\t\t$" + df.format((amountOfShare * amountPaidPerShare))); 
		//price payed would be amount of shares * the price
		System.out.println("Commision Paid:\t\t\t$" + df.format((amountOfShare * amountPaidPerShare * BROKER))); 
		//to calculate the broker fee it would be the amount of paid * the BROKER fee
		System.out.println("Stock Sold for:\t\t\t$"  + df.format((amountOfShare * amountSoldPerShare)));
		//the amount sold for would be the amount of stock * the sale price
		System.out.println("Amount Paid to the Broker:\t$" + df.format((amountOfShare * amountSoldPerShare * BROKER)));
		//broker would be sale * broker fee
		System.out.println("The total profit is\t\t$" + df.format(net));
		//prints put net see net comment
	}

}
