package Array;
import java.util.Scanner;
public class MaxMinNum59 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int [] num= new int [size];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);

		//for(int obj:num) {
		//	System.out.println(obj);
		//System.out.println("Maximum: "+num[0]);
		//System.out.println("Minimum: "+num.length);
	//}
	}

}
