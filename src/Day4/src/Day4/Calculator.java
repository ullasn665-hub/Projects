package Day4;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter b number:");
		int b=sc.nextInt();
		System.out.println("For Addition:1");
		System.out.println("For Subtraction:2");
		System.out.println("For Multiplication:3");
		System.out.println("For Division:4");
		
		System.out.println("Enter Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

}
