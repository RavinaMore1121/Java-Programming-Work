package Array;
import java.util.Scanner;
public class DIArray50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int [] b=new int[size];
		for(int i=0;i<size;i++) {
			b[i] =sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
		}		
	}
}