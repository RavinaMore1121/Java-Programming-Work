package basic;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Subject Marks: ");
		double m1=sc.nextDouble();
		System.out.println("Enter Second Subject Marks: ");
		double m2=sc.nextDouble();
		System.out.println("Enter Third Subject Marks: ");
		double m3=sc.nextDouble();
		System.out.println("Enter Fourth Subject Marks: ");
		double m4=sc.nextDouble();
	    double res=((m1+m2+m3+m4)*100)/400;
		System.out.println("Result: "+res);
	}

}
