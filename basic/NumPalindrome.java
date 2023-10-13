package basic;
import java.util.Scanner;
public class NumPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rev=0;
		int temp;
		System.out.println("Enter a Number"); 
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			  int remainder = n % 10;  
			  rev = rev * 10 + remainder;  
			  n = n/10;  
		}
		System.out.println("Original Number is: "+temp);
		System.out.println("Reverse of Number is: "+rev);
		if(temp==rev)
		{
			  System.out.println("Number is palindrome");
		}
		else
		{
			  System.out.println("Number is not palindrome");
		}
	}
}
