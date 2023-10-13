package basic;
import java.util.Scanner;
public class Swap2NumUsing3rd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping");
		System.out.println(num1);
		System.out.println(num2);
	}

}
