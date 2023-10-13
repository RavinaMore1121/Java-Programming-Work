package Array;
import java.util.Scanner;
public class SecondMaxMin60 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Min not working
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int [] num=new int [size];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		int max=num[0];
		int max2=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max2 = max;
				max=num[i];
			}
			if(num[i]>max2 && num[i]!=max)
			{
				max2=num[i];
			}
		}
		int min=num[0];
		int min2=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min2 = min;
				min=num[i];
			}
			if(num[i]<min2 && num[i]!=min)
			{
				min2=num[i];
			}
		}
		System.out.println("Second Max:"+max2);
		System.out.println("Second Min:"+min2);
	}
} 