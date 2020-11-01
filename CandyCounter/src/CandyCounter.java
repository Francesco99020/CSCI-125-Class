import java.util.Scanner;
import java.util.Arrays;

public class CandyCounter {

	public static void main(String[] args) {
		//introduction to class
		System.out.println("Hello!");
		System.out.println("This Program will take one or multiple orders of candy for a fundraiser");
		System.out.println("Then once all the orders have been placed the program will return an array of the list of items ordered");
		//Initializes array
		int[] OrderCounter;
		OrderCounter = new int[5];
		/*These are the 5 integers to hold value of individual items
		 * cwn = Chocolate with Nuts
		 * cc = Chewy Chocolates
		 * dcc = Dark Chocolate Creams
		 * sfs = Sugar Free Suckers
		 */
		//keeps track of how many orders has been placed
		int OrderAmount = 0;
		System.out.println(" ");
		//allows user to input an order
OrderQuestion: while(OrderCounter.length == 5){
	System.out.println("Would you like to input an order?");
		Scanner input = new Scanner(System.in); 
		String answer = input.next();
		if(answer.equals("yes")){
			OrderAmount++;
			System.out.println("Great!");
			System.out.println("Enter the amount of each item the customer has bought.");
			System.out.println("If the customer did not order any of a specific item enter '0'.");
			System.out.println("How many Mints did the customer order?");
			Scanner input1 = new Scanner(System.in); 
			int mints = input1.nextInt();
			System.out.println("How many Chocolate with nuts did the customer order?");
			Scanner input2 = new Scanner(System.in); 
			int cwn = input2.nextInt();
			System.out.println("How many Chewy Chocolate's did the customer order?");
			Scanner input3 = new Scanner(System.in); 
			int cc = input3.nextInt();
			System.out.println("How many Dark Chocolate Creams did the customer order?");
			Scanner input4 = new Scanner(System.in); 
			int dcc = input4.nextInt();
			System.out.println("How many Suger Free Suckers did the customer order?");
			Scanner input5 = new Scanner(System.in); 
			int sfs = input5.nextInt();
			OrderCounter[0] = mints + OrderCounter[0];
			OrderCounter[1] = cwn + OrderCounter[1];
			OrderCounter[2] = cc + OrderCounter[2];
			OrderCounter[3] = dcc + OrderCounter[3];
			OrderCounter[4] = sfs + OrderCounter[4];
			continue OrderQuestion;
		}
		else if(answer.equals("no")){
			System.out.println("Ok");
			if(OrderAmount == 0){
				System.out.println("No orders have been places");
				System.out.println("Goodbye");
				System.exit(0);
			}else{
				System.out.print("The amount of orders placed today are: ");
				System.out.println(OrderAmount);
				System.out.println("The Amount of each item purchased has been recored in the following order...");
				System.out.println("[Mints, Chocolate with Nuts, Chewy Chocolate, Dark Chocolate Creams, Suger Free Suckers]");
				System.out.println(Arrays.toString(OrderCounter));
				System.out.println("Goodbye");
				System.exit(0);
			}
		}
		else{
			System.out.println("I didn't quite catch that.");
			System.out.println("Please answer with yes or no, thank you");
			continue OrderQuestion;
		}
      }

	}

}
