package basic;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age of Person");
		int age=sc.nextInt();
		System.out.println("Enter weight of person");
		int w=sc.nextInt();
		if(age>=18)
		{
			if(w>=55) 
			{
				System.out.println("You can Donate Blood");
			}
			else
			{
				System.out.println("Rejected by Weight");
			}
		}
		else
		{
			System.out.println("Rejected by Age");
		}
	}

}
