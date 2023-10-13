package basic;
import java.util.Scanner;
public class DigitalSumofEvenNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int last=n%10;
			if(last%2==0)
			{
				sum+=last;
			}
			n/=10;
		}
		System.out.println("Digital Sum of Digital Even Number"+sum);

	}

}
