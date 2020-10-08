import java.util.Scanner;

public class PositiveChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please insert a integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("the Integer you have entered is " + number);
		System.out.println("checking integer database...");
		if(number<0) {
			System.out.print("The integer " + number);
			System.out.println(" is negitive");
		}else {
			System.out.print("The integer " + number);
			System.out.println(" is positive");
		}
		System.out.println("Goodbye");

	}

}
