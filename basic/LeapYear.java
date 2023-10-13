package basic;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Year");
		int y=sc.nextInt();
		if(y%4==0)
		{
			if(y %100==0)
			{
				if(y%400==0)
				{
					System.out.println("Century Leap year");
				}
				else 
				{
					System.out.println("Not a Leap Year");
				}
			}
			else {
				System.out.println("leap year");
			}
		}
		else {
			System.out.println("Not a Leap Year");
		}	
	}
}
// 34: WAP 
// 35:
// 36:


