package basic;
import java.util.Scanner;
public class SmallestofFour {
	public static int smallest(int num1,int num2,int num3,int num4)
	{
		int res=(num1<num2)?num1:(num2<num3)?num2:(num3<num4)?num3:num4;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Three Number");
		int num3=sc.nextInt();
		System.out.println("Enter Fourth Number");
		int num4=sc.nextInt();
		int result=smallest(num1,num2,num3,num4);
		System.out.println("Smallest Number:"+result);
	}
}