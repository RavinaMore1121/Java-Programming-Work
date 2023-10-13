package basic;

import java.util.Scanner;

public class Average3Num {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number: ");
		int num3=sc.nextInt();
		int add=num1+num2+num3;
		System.out.println("Addition of Two Numbers : "+add);
		int avg=add/3;
		System.out.println("Average of Three Numbers is : "+avg);
	}
}
