package basic;
import java.util.Scanner;
public class FirstNPrimeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many prime numbers do you want to print upto 100?");
		int LastNum=sc.nextInt(); //3
		int count=0;
		for(int i=2;i<=100;i++) 
		{
			boolean b=false;
			for(int j=2;j<=(i/2)+1;j++)
			{
			
				if(i%j==0)
				{
					b=false;
					break;
				}
				else {
					b=true;
				}
				
			}
			if(b)
			{
				System.out.println(i);
				count++;
				if( count>=LastNum)
				{
					break;
				}
			}
		}
	}
}
		