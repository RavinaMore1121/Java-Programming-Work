package basic;
import java.util.Scanner;
public class FactofN {
	public static int fact(int n)
	{
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println(res);
	}
}