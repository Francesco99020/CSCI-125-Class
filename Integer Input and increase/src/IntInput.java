import java.util.Scanner;

public class IntInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter an Integer: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		System.out.print("Your integer increase is ");
		System.out.print(++number);
	}

}
