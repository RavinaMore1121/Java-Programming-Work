package basic;
import java.util.Scanner;
public class DigitalSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int last=n%10;
			sum+=last;
			n/=10;
		}
		System.out.println("Sum is: "+sum);
	}
}
