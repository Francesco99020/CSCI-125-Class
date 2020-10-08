import java.util.Scanner;

public class RandomNumGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//greetings and program overview
		System.out.println("Hello");
		System.out.println("This program take a number from 1 to 7 and dispalys the corralating weekday");
		//allows user to input a number
		System.out.print("please enter any number ranging from 1 to 7");
		System.out.print("Enter a number from 1 to 7: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		//checks if the number is between 1 to 7
		if(a>7 || a<1) {
			System.out.println("The number you entered is " + a);
			System.out.println("The number you entered is not between 1 and 7");
		}
		//checks what number was entered and displays correlating weekday
		if(a==1) {
			System.out.println("The number you entered is 1");
			System.out.println("The day of the week Correlating with 1 is: Monday");
		}
		if(a==2) {
			System.out.println("The number you entered is 2");
			System.out.println("The day of the week Correlating with 2 is: Tuesday");
		}
		if(a==3) {
			System.out.println("The number you entered is 3");
			System.out.println("The day of the week Correlating with 3 is: Wednesday");
		}
		if(a==4) {
			System.out.println("The number you entered is 4");
			System.out.println("The day of the week Correlating with 4 is: Thurday");
		}
		if(a==5) {
			System.out.println("The number you entered is 5");
			System.out.println("The day of the week Correlating with 5 is: Friday");
		}
		if(a==6) {
			System.out.println("The number you entered is 6");
			System.out.println("The day of the week Correlating with 6 is: Saturday");
		}
		if(a==7) {
			System.out.println("The number you entered is 7");
			System.out.println("The day of the week Correlating with 7 is: Sunday");
		}
		System.out.println("Goodbye");

	}

}
