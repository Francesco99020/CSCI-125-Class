import java.util.Scanner;
import java.text.DecimalFormat;

abstract class discountPolicy1{
	//abstract variables
	public String answer;
	public String item = getItem();
	public int quantity = getQuantity();
	public double discount = computeDiscount();
	public double discountB = computeBulkDiscount();
	//abstract methods
	
	public String getItem() {
			question: while(3 == 3) {System.out.println("What item would you like to buy?");
			System.out.print("apples cost $1 each, bananas cost $1.20 each and oranges cost $0.95 each   ");
			Scanner input1 = new Scanner(System.in);
			String item = input1.next();
			if(item.equals("apples")) {
				return item;
			}else if(item.equals("bananas")) {
				return item;
			}else if(item.equals("oranges")) {
				return item;
	}else {
		System.out.println("I couldn't understand your answer, please respond with either apples, bananas or oranges. Thank you");
		continue question;
	}
 }
}
	public int getQuantity() {
		
				System.out.println("how many " + item + " would you like to purchase?"); 
				Scanner input2 = new Scanner(System.in);
				int quantity = input2.nextInt();
				return quantity;
					
				}
				
	public double computeDiscount() {
	if(item.equals("apples")) {
		double amountBeforeDiscount = 1*quantity;
		double discount = amountBeforeDiscount*0.10;
		double amountAfterDiscount = quantity-discount;
		return amountAfterDiscount;
	}else if(item.equals("bananas")) {
		double amountBeforeDiscount = 1.20*quantity;
		double discount = amountBeforeDiscount*0.10;
		double amountAfterDiscount = quantity-discount;
		return amountAfterDiscount;
	}else {
		double amountBeforeDiscount = 0.95*quantity;
		double discount = amountBeforeDiscount*0.10;
		double amountAfterDiscount = quantity-discount;
		return amountAfterDiscount;
	}
}
	public double computeBulkDiscount(){
		if(item.equals("apples")) {
			double amountBeforeDiscount = 1*quantity;
			double discount = amountBeforeDiscount*0.25;
			double amountAfterDiscount = quantity-discount;
			return amountAfterDiscount;
		}else if(item.equals("bananas")) {
			double amountBeforeDiscount = 1.20*quantity;
			double discount = amountBeforeDiscount*0.25;
			double amountAfterDiscount = quantity-discount;
			return amountAfterDiscount;
		}else {
			double amountBeforeDiscount = 0.95*quantity;
			double discount = amountBeforeDiscount*0.25;
			double amountAfterDiscount = quantity-discount;
			return amountAfterDiscount;
		}
	}
	public void Output() {
		DecimalFormat two = new DecimalFormat("0.00");
		if(quantity > 25) {
			System.out.println("Because you have purchased more than 25 of a single item you qualify for the Bulk buy discount!");
			System.out.println("You have purchased " + quantity + " " + item + " for $" + two.format(discountB) + ".");
		System.out.println("Goodbye");
	}else {
		System.out.println("You have qualifiyed for the standard purchase discount!");
		System.out.println("You have purchased " + quantity + " " + item + " for $" + two.format(discount) + ".");
		System.out.println("Goodbye");
	}
 }
}
class Customer extends discountPolicy1{
	int age;
	String name;
}

public class DiscountPolicy {

	public static void main(String[] args) {
		System.out.println("Hello, this virtual store sells fruits");
		System.out.println("Today we have apples, bananas and oranges in stock ");
		Customer c = new Customer();
		int quantity = c.getQuantity();
		if(quantity < 25 ) {
			c.computeDiscount();
		}else {
			c.computeBulkDiscount();
		}
		c.Output();
		System.exit(0);
		
 }
}
