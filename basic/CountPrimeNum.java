package basic;

import java.util.Scanner;

public class CountPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int pcount=0;
		int result=1;
		while(num!=0)
		{
			int rem=num%10;
			int count=0;
			for(int i=1;i<=rem;i++)
			{
				if(rem%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				pcount++;
			}
			num=num/10;
		}
		System.out.println("Prime Counts:"+pcount);
		
	}

}
