package Array;
import java.util.Scanner;
public class AverageofElements56 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] b=new int[size];
		int sum=0;
		int avg=0;
		for(int i=0;i<b.length;i++) {
			b[i] =sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i];
			avg=sum/b.length;
		}
		System.out.println("Summation: "+sum);
		System.out.println("Average: "+avg);
	}

}
