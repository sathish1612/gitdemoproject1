package src;

import java.util.Scanner;

public class MainCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CalculatorImp c = new CalculatorImp();
	System.out.println("Welcome to Calculator");
	System.out.println("==============================");
	
	while(0==0) {
		System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division");
		System.out.println("Enter the choice");
	
		int choice = sc.nextInt();
		int a=0;
		int b=0;
	
		if (choice>0 && choice<5) {
			System.out.println("Enter the First Number");
			a=sc.nextInt();
			System.out.println("Enter the Second Number");
			b=sc.nextInt();
		
	}

	
		switch (choice) {
		case 1:
		{
			System.out.println("Sumation of the two given Number is :  "+c.add(a,b));
			break;
		}
		case 2:
		{
			System.out.println("Difference of the two given Number is :  "+c.sub(a, b));
			break;
		}
		case 3:
		{
			System.out.println("Multiplication of the two given Number is :  "+c.mul(a, b));
			break;
		}
		case 4:
		{
			System.out.println("Division of the two given Number is  :  "+c.div(a, b));
			break;
		}

		default:
		{
			System.out.println("Invalid Choice ....Select Correct Choice");
		}
		}
	}
}
}
