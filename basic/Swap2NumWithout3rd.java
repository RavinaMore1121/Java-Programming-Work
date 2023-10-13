package basic;
import java.util.Scanner;
public class Swap2NumWithout3rd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt(); //50
		System.out.println("Enter Second Number");
		int num2=sc.nextInt(); //30
		num1=num1+num2; //80
		num1=num1-num2; //20
		num2=num1+num2; //20+30=50 
		num1=num2-num1;//50-20=30
		num2=num2-num1;//50-30=20
		System.out.println(num1);
		System.out.println(num2);
	}
}