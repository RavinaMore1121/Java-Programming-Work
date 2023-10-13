package Array;
import java.util.Scanner;
//find the missing  elements from the given array from 0 to n
public class MissingElements57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		boolean flag=true;
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int t=a[i+1];
				if(a[i]==t)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
