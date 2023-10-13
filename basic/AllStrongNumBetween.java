package basic;
import java.util.Scanner;
public class AllStrongNumBetween {
	//145=1!+4!+5!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(detectStrong(num))
			{
				System.out.println(num+":is strong number");
			}
		}
	}
	//function to declare factorial
	static int facto(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	static boolean detectStrong(int num)
	{
		int digit, sum=0;
		int temp=num;
		boolean flag=false;
		//calculate 1!+4!+5!
		while(temp!=0)
		{
			digit = temp%10;
			sum=sum+facto(digit);
			temp/=10;
		}
		//returns 1 if both equal else 0
		if(sum==num)
			flag=true;
		else
			flag=false;
		return flag;	
	}


}
