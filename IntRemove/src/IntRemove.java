import java.util.Scanner;
import java.util.Arrays;

public class IntRemove {

	public static void main(String[] args) {
		//Initializes Array and values in array
		int[] Array;
		Array = new int[10];
		Array[0] = 0;
		Array[1] = 0;
		Array[2] = 0;
		Array[3] = 0;
		Array[4] = 0;
		Array[5] = 0;
		Array[6] = 0;
		Array[7] = 0;
		Array[8] = 0;
		Array[9] = 0;
		//allows the user to enter 10 numbers for Array
		System.out.print("please enter first number: ");
		Scanner input = new Scanner(System.in); 
		Array[0] = input.nextInt();
		System.out.print("please enter next number: ");
		Scanner input1 = new Scanner(System.in); 
		Array[1] = input1.nextInt();
		System.out.print("please enter next number: ");
		Scanner input2 = new Scanner(System.in); 
		Array[2] = input2.nextInt();
		System.out.print("please enter next number: ");
		Scanner input3 = new Scanner(System.in); 
		Array[3] = input3.nextInt();
		System.out.print("please enter next number: ");
		Scanner input4 = new Scanner(System.in); 
		Array[4] = input4.nextInt();
		System.out.print("please enter next number: ");
		Scanner input5 = new Scanner(System.in); 
		Array[5] = input5.nextInt();
		System.out.print("please enter next number: ");
		Scanner input6 = new Scanner(System.in); 
		Array[6] = input6.nextInt();
		System.out.print("please enter next number: ");
		Scanner input7 = new Scanner(System.in); 
		Array[7] = input7.nextInt();
		System.out.print("please enter next number: ");
		Scanner input8 = new Scanner(System.in);
		Array[8] = input8.nextInt();
		System.out.print("please enter final number: ");
		Scanner input9 = new Scanner(System.in); 
		Array[9] = input9.nextInt();
		System.out.println(" ");
		//confirms to user the number they entered
		System.out.println("your array list is:");
		System.out.println(Arrays.toString(Array));
		//checks for the number 7 and removes it
		for(int i = 0; i<Array.length; i++){
			if(Array[i] == 7) {
				Array[i] = 0;
				continue;
			}
			else{
				continue;
			}			
		}
		
Outerloop: for(int f = 0; f<Array.length; f++) {
			for(int d = f+1; d<Array.length;) {
				if(Array[f] == 0){
					int temp = Array[d];
					Array[d] = Array[f];
					Array[f] = temp;
					continue Outerloop;
					}
				else{
					continue Outerloop;		
				    }
			}
		}
		System.out.println(Arrays.toString(Array));
		
	}
}