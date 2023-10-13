package basic;

import java.util.Scanner;

public class PowerofN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int p=sc.nextInt();
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			p=p*n;
		}
		System.out.println(p);
	}
}