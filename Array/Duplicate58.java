package Array;
import java.util.Scanner;
public class Duplicate58 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				 System.out.println(a[i]);
				}
			}
		}
	}
}