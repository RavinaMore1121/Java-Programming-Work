package basic;
import java.util.Scanner;
public class DigitalProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int product=1;
		while(n>0)
		{
			int last=n%10;
			product*=last;
			n/=10;
		}
		System.out.println("Digital Product is: "+product);
	}
}