package basic;
import java.util.Scanner;
public class DivisibleBy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		/*if(num%3==0 && num%5==0) {
			System.out.println(num+" HiBye");
		}
			if(num%3==0) {
				System.out.println(num+" HI");
			}
			if(num%5==0) {
				System.out.println(num+" BYE");
			}*/
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("HiBye");
			}
			else if(i%3==0) {
					System.out.println("HI");
				}
			else if(i%5==0) {
					System.out.println("BYE");
				}
			else {
				System.out.println(i);
			}
		}
		}
}