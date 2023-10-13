package basic;
import java.util.Scanner;
public class PrintNumfromN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
		//while-loop
		System.out.println("Using While Loop");
		int n=1;
		while(num>=n)
		{
			System.out.println(num);
			num--;
		}
		//do-while-loop
		System.out.println("Using Do While Loop");
		int m=1;
		do {
			System.out.println(num);
			num--;
		}while(num>=m);
	}
}