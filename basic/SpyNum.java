package basic;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//combination of sum of digits and product of digits
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int sum=0;
			int pro=1;
			while(a>0)
			{
				int rem=a%10;
				sum=sum+rem;
				pro=pro*rem;
				a=a/10;
			}
			System.out.println(pro);
			
			if(sum==pro)
			{
				System.out.println("Spy Number");
			}
			else
			{
				System.out.println("Not spy Number");
			}
	}

}
