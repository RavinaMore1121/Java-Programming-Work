package basic;
import java.util.Scanner;
public class SmallestofTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2=sc.nextInt();
		int res=(num1<num2)?num1:num2;
		System.out.println(res);
	}
}
