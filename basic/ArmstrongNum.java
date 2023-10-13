package basic;
import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int copy=n;
		int temp=n;
		int sum=0;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		while(copy>0)
		{
			int rem=copy%10;
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			copy=copy/10;
		}
		if(temp==sum) {
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not ArmStrong Number");
		}
	}
}