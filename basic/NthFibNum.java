package basic;
import java.util.Scanner;
public class NthFibNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		int sum=2;
		int count=2;
		for(int i=0;i<=n;i++) {
			sum=num1+num2; //1
			num1=num2;
			num2=sum;
		    count++;
		    if(count==n)
			{
				System.out.println(sum);
			}
		}
		//0,1,1,2,3,5,8,
	}
}