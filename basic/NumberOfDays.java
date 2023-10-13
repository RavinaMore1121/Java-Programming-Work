package basic;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month");
		int month=sc.nextInt();
		if(month%2==0) {
			if(month==2)
			{
				System.out.println("28/29 days");
			}
			else {
				System.out.println("30 days");
			}
		}
		else {
			System.out.println("31 days");
		}
	}

}
