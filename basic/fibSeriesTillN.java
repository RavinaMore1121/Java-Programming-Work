package basic;
import java.util.Scanner;
public class fibSeriesTillN{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		int sum=2;
		for(int i=0;i<=n;i++) {
			sum=num1+num2; //1
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
	}
}
 