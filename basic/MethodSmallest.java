package basic;
import java.util.Scanner;
public class MethodSmallest {
	public static int Smallest(int n1,int n2,int n3)
	{
		return n1<n2&&n1<n3?n1:n2<n1&&n2<n3?n2:n3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		//int l=Largest(n1, n2, n3);
		System.out.println(Smallest(n1, n2, n3));
	}
}
