package basic;
import java.util.Scanner;
public class EligibleForMarriage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Is Person Girl or Boy?");
		String str=sc.next();
		if(str.equals("Girl"))
		{
			System.out.println("Enter Age of Girl: ");
			int age1=sc.nextInt();
			if(age1>=18)
			{
				System.out.println("Girl is Eligible For Marrige");
			}
			else
			{
				System.out.println("Girl is not eligible for marriage");
			}
		}
		else if(str.equals("Boy"))
		{
			System.out.println("Enter Age of boy: ");
			int age2=sc.nextInt();
			if(age2>=22)
			{
				System.out.println("Boy is Eligible For Marrige");
			}
			else
			{
				System.out.println("Boy is not eligible for marriage");
			}
		}
	}

}
