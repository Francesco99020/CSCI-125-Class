import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrder {
	
	public static void main(String[] args) {
		//creates array
		double[] array;
		array = new double[10];
		//assigns given values to array
		array[0] = 0;
		array[1] = 0;
		array[2] = 0;
		array[3] = 0;
		array[4] = 0;
		array[5] = 0;
		array[6] = 0;
		array[7] = 0;
		array[8] = 0;
		array[9] = 0;
		//introduction to the program and what it does
		System.out.println("Hello, this program takes 10 number's and creates an array of those numbers in the order you entered them");
		System.out.println("Then the program determines if the numbers entered are in order of least to greatest by checking the number in front of it in the array");
		System.out.println(" ");
		//lets user input 10 numbers
		System.out.print("please enter first number: ");
		Scanner input = new Scanner(System.in); 
		array[0] = input.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input1 = new Scanner(System.in); 
		array[1] = input1.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input2 = new Scanner(System.in); 
		array[2] = input2.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input3 = new Scanner(System.in); 
		array[3] = input3.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input4 = new Scanner(System.in); 
		array[4] = input4.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input5 = new Scanner(System.in); 
		array[5] = input5.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input6 = new Scanner(System.in); 
		array[6] = input6.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input7 = new Scanner(System.in); 
		array[7] = input7.nextDouble();
		System.out.print("please enter next number: ");
		Scanner input8 = new Scanner(System.in);
		array[8] = input8.nextDouble();
		System.out.print("please enter final number: ");
		Scanner input9 = new Scanner(System.in); 
		array[9] = input9.nextDouble();
		System.out.println(" ");
		//confirmation for inputed values
		System.out.println("Thank you for your input!");
		System.out.println("The numbers in the array are as follows: ");
		System.out.println(Arrays.toString(array));
		System.out.println(" ");
		System.out.println("System processing...");
		System.out.println(" ");
		//checks if value are in increasing order by pairs
Outerloop: for(int i = 0; i<array.length; i++){
			for(int k = i+1; k<array.length; k++){
				if(array[i] < array[k]){
					System.out.println("True, double " + array[i] + " is less then double " + array[k]);
					System.out.println(" ");
					continue Outerloop;	
				}
				else if(array[i] > array[k]) {
					System.out.println("False, double " + array[i] + " is greater then double " + array[k]);
					System.out.println(" ");
					continue Outerloop;
				}
				else{
					System.out.println("False, double " + array[i] + " is equal to double " + array[k]);
					System.out.println(" ");
					continue Outerloop;
				}
			}
		}
		//ending statement to user
		System.out.println("Thank you for utilising this program!");
		System.out.println("Goodbye");
			}
		}