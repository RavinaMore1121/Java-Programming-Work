package basic;
import java.util.Scanner;
public class ValidMonth {
//W++E2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Month");
		int month=sc.nextInt();
		if(month<=1 && month>=12)
		{
			System.out.println("Valid Month");
		}
		else
		{
			System.out.println("Not valid month");
		}
	}

}
