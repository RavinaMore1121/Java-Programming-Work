package basic;
import java.util.Scanner;
public class ArmStrongNumBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print all the Armstrong numbers sbetween 1 to n
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int copy=n;
		int temp=n;
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++) {
			while(n>0) {
				count++;
				n=n/10;
			}
			while(copy>0)
			{
				int rem=copy%10;
				int pro=1;
				for(int j=1;j<=count;j++)
				{
					pro=pro*rem;
				}
				sum=sum+pro;
				copy=copy/10;
			}
			while(temp==sum) {
				System.out.println(n);
			}
		}
	}

}
