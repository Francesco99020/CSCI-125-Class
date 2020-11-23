import java.text.DecimalFormat;
import java.util.Scanner;

abstract class PayCalc{
	//declares variables
	double pay = getPay();
	double payPerYear = pay;
	double payPerHour = payRate();
	double hazardPay = HazardPay();
	double todaysPay = computePay();
	//declares methods
	public double payRate(){
		pay = pay/12;
		pay = pay/4;
		pay = pay/7;
		pay = pay/8;
		double payPerHour = pay;
		return payPerHour;
		
	}
	public double getPay() {
		System.out.println("How much does this employee make per year?");
		Scanner input = new Scanner(System.in);
		double pay = input.nextDouble();
		return pay;
	}
	public double HazardPay(){
		question: while(3 == 3) {
		System.out.println("Is this employee reciving hazard pay today?");
		System.out.println("please answer question with either yes or no, thank you!");
		Scanner input2 = new Scanner(System.in);
		String answer  = input2.next();
		if(answer.equals("yes")){
			System.out.println("Ok, adding bounus pay...");
			double hazardPay = 1.5;
			return hazardPay;
		}else if(answer.equals("no")) {
			double hazardPay = 1;
			return hazardPay;
		}else {
			System.out.println("Sorry I didn't get that");
			System.out.println("Please respond with either yes or no, thank you");
			continue question;
		}
	}
	}
	public double computePay() {
		System.out.println("How many hours did this employee work today?");
		Scanner input1 = new Scanner(System.in);
		double hours = input1.nextDouble();
		double todaysPay = hours*payPerHour;
		todaysPay = todaysPay*hazardPay;
		return todaysPay;
	}
	public void output() {
		//Make new decimal format
		DecimalFormat two = new DecimalFormat("0.00");
		System.out.println("This employee makes $" + two.format(payPerYear) + " per year.");
		if(hazardPay == 1.0) {
		System.out.println("This employee mades $" + two.format(payPerHour) + " per hour.");
		System.out.println("Today this employee made $" + two.format(todaysPay) + " today!");
		}else {
		System.out.println("This employee makes $" + two.format(payPerHour) + " per hour.");
		System.out.println("Today this employee made $" + two.format(todaysPay) + " today with hazard pay.");
	}
}
}
class Employee extends PayCalc{
	//declares variables
	int age;
	String name;
	String Position;
	
}
public class payCalculator {
	

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("This program will take an employee's pay per year and convert it into pay/hour and then give back the amount of money earned by said employee based on the hours worked.");
		Employee a = new Employee();
		a.output();
		System.out.println("goodbye");
		System.exit(0);

	}

}