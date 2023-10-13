package basic;
import java.util.Scanner;
public class printNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
		}
		//while-loop
		System.out.println("Using While Loop");
		int n=0;
		while(num>=n)
		{
			System.out.println(n);
			n++;
		}
		//do-while-loop
		System.out.println("Using Do While Loop");
		int m=0;
		do {
			System.out.println(m);
			m++;
		}while(num>=m);
	}
}