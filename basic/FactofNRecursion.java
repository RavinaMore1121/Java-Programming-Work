package basic;
import java.util.Scanner;
public class FactofNRecursion {
	public static int fact(int n)
	{
		if(n>=1)
		{
			return n*fact(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println("Factorial of Given Number:"+res);
	}
}