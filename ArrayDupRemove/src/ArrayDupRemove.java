import java.util.Arrays;
import java.util.Scanner;

public class ArrayDupRemove {

	public static void main(String[] args) {
		//greetings and explanation of program
		System.out.println("Greetings user!");
		System.out.println("This Program will take 5 numbers and turn then into an array of integers");
		System.out.println("The Program will then put the values you entered into increasing order.");
		System.out.println("Finally the Program will convert your old array into a new one without any duplicate values.");
		System.out.println("Note: Please don't include the number '0' in your list, thank you.");
		//initializes OldArray
		int[] OldArray;
		OldArray = new int[6];
		//Initializes NewArray
		int[] NewArray;
		NewArray = new int[5];
		//sets values of both Arrays
		System.out.print("please enter first number: ");
		Scanner input = new Scanner(System.in); 
		OldArray[0] = input.nextInt();
		System.out.print("please enter next number: ");
		Scanner input1 = new Scanner(System.in); 
		OldArray[1] = input1.nextInt();
		System.out.print("please enter next number: ");
		Scanner input2 = new Scanner(System.in); 
		OldArray[2] = input2.nextInt();
		System.out.print("please enter next number: ");
		Scanner input3 = new Scanner(System.in); 
		OldArray[3] = input3.nextInt();
		System.out.print("please enter last number: ");
		Scanner input4 = new Scanner(System.in); 
		OldArray[4] = input4.nextInt();
		OldArray[5] = 0;
		
		NewArray[0] = 0;
		NewArray[1] = 0;
		NewArray[2] = 0;
		NewArray[3] = 0;
		NewArray[4] = 0;
		//print length and integers of Array
		System.out.print("the length of the array is: ");
		System.out.println(OldArray.length-1);
		System.out.println(" ");
		System.out.println("The integers of the array are: ");
		System.out.println("[" + OldArray[0] + ", " + OldArray[1] + ", " + OldArray[2] + ", " + OldArray[3] + ", " + OldArray[4] + "]");
		//Sorts Array in increasing order and prints it to user
		Arrays.sort(OldArray);
		System.out.println(" ");
		System.out.println("Organizing Array in increasing values...");
		System.out.println(" ");
		System.out.println("Your Array has been sorted: ");
		System.out.println("[" + OldArray[1] + ", " + OldArray[2] + ", " + OldArray[3] + ", " + OldArray[4] + ", " + OldArray[5] +"]");
		System.out.println(" ");
		System.out.println("checking for duplicate values inside array...");
		//checks array for duplicates 
			Outerloop: for(int a=0; a<OldArray.length; a++) {
			for(int b=a+1; b<OldArray.length; b++) {
				//if array finds duplicate it skips over this pair
				if(OldArray[a] == OldArray[b]){
				System.out.println("There is a duplicate!!");
				continue Outerloop;
			}
				
				else if(OldArray[a] != OldArray[b] && NewArray[0] == 0){
					NewArray[0] = OldArray[b];
					continue Outerloop;
					}else if(OldArray[a] != OldArray[b] && NewArray[1] == 0) {
						NewArray[1] = OldArray[b];
						continue Outerloop;
					}else if(OldArray[a] != OldArray[b] && NewArray[2] == 0) {
						NewArray[2] = OldArray[b];
						continue Outerloop;
					}else if(OldArray[a] != OldArray[b] && NewArray[3] == 0) {
						NewArray[3] = OldArray[b];
						continue Outerloop;
					}else if(OldArray[a] != OldArray[b] && NewArray[4] == 0) {
						NewArray[4] = OldArray[b];
						continue Outerloop;
					}
				}
			}
		System.out.println(" ");
		System.out.println("Your Array has been checked for duplicate's and converted into a 'new Array'.");
		//sorts new array in increasing order and prints to user
		Arrays.sort(NewArray);
		System.out.println(" ");
		System.out.println("Now Organizing your new Array in increasing values...");
		System.out.println(" ");
		System.out.println("Your new Array has been sorted: ");
		System.out.println("[" + NewArray[1] + ", " + NewArray[2] + ", " + NewArray[3] + ", " + NewArray[4] + "]");
		//End of Program
		System.out.println(" ");
		System.out.println("Thank you for utilizing this program!");
		System.out.println("Goodbye");
	}
}