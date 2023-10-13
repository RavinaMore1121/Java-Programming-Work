package Array;
import java.util.Scanner;
public class CopyToAnother {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int [] ca=new int[a.length];
		for(int i=0;i<ca.length;i++)
		{
			ca[i]=a[i];
		}
		System.out.println("elements present inside copy array");
		for(int i=0;i<ca.length;i++)
		{
			System.out.println(ca[i]);
		}
	}

}
