package basic;

import java.util.Scanner;

public class LargestofThree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number");
		int num3=sc.nextInt();
		int res=(num1>num2)?num1:(num2>num3)?num2:num3;
		System.out.println(res);
	}

}
