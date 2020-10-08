import java.util.Scanner;

public class CompareThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greetings
		System.out.println("Hello!");
		System.out.println("This Program will find the biggest of three numbers");
		//lets user enter 3 numbers
		System.out.print("Please enter your first number ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("Please enter your second number ");
		Scanner input1 = new Scanner(System.in);
		int b = input1.nextInt();
		System.out.print("Please enter your third number ");
		Scanner input2 = new Scanner(System.in);
		int c = input2.nextInt();
		//tells the user the numbers inputed in the order they where given 
		System.out.print("Your first number is " + a);
		System.out.print(", your second number is " + b);
		System.out.println(" and your third number is " + c);
		//deduces the largest of the 3 numbers (program terminates if largest number is found)
		if(a>b && a>c){
			System.out.println(a + " is the biggest number you inputed");
			System.out.println("Goodbye");
			System.exit(0);
		}if(b>a && b>c){
			System.out.println(b + " is the biggest number you inputed");
			System.out.println("Goodbye");
			System.exit(0);
		}if(c>b && c>a){
			System.out.println(c + " is the biggest number you inputed");
			System.out.println("Goodbye");
			System.exit(0);
		}
		/*if no largest number is found
		 *this part determines if two or more of the largest values are equal */
		if(a==b & b==c & a==c){
			System.out.print(a);
			System.out.print(", ");
			System.out.print(b);
			System.out.print(" and ");
			System.out.print(c);
			System.out.println(" are all equal and there is no greatest number");
		}
			else if(a==b){
			System.out.print(a);
			System.out.print(" and ");
			System.out.print(b);
			System.out.println(" are equal and there is no greatest number");
		}else if(b==c){
			System.out.print(b);
			System.out.print(" and ");
			System.out.print(c);
			System.out.println(" are equal and there is no greatest number");
		}else if(c==a){
			System.out.print(c);
			System.out.print(" and ");
			System.out.print(a);
			System.out.println(" are equal and there is no greatest number");
		}
		System.out.println("Goodbye");
	}

}
