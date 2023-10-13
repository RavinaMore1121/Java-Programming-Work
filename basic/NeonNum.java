package basic;
import java.util.Scanner;
public class NeonNum {
	//9;9*9=81;8+1=9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		int square=num*num;
		while(square!=0)
		{
			int digit=square%10;
			sum=sum+digit;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println(num+"is a Neon Number");
		}
		else
		{
			System.out.println(num+"is not Neon Number");
		}
	}
}