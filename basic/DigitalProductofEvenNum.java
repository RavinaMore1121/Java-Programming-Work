package basic;

import java.util.Scanner;

public class DigitalProductofEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int product=1;
		while(n>0)
		{
			int last=n%10;
			if(last%2==0)
			{
				product*=last;
			}
			n/=10;
		}
		System.out.println("Product of Digital Even Number is : "+product);	
	}

}
