package basic;
import java.util.Scanner;
public class PerfectSquare {
	//1,4,9,16,25,...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		if(checkPerfectSquare(num))
		{
			System.out.println("Yes,the given number is perfect square");
		}
		else
		{
			System.out.println("Not a Perfect Square");
		}
	}
	static boolean checkPerfectSquare(int num)
	{
		for(int i=1;i*i<=num;i++)
		{
			if((num%i==0)&&(num/i==i))
			{
				return true;
			}
		}
		return false;
	}
}
