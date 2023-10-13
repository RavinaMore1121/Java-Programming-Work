package basic;

import java.util.Scanner;

public class PhloemNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"12345"=> 1+5==2+3+4=> 6==9 "Wrong" =>Not xylem Number=>Phloem
				//"1526"=> 1+6==5+2=> 7==7 "Right" =>Xylem Number
				
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number");
				int num=sc.nextInt();
				int extreme_sum=0,mean_sum=0,n;
				num=Math.abs(num);
				n=num;
				while(n!=0) {
					if(n==num || n<10) {
						extreme_sum=extreme_sum+n%10;
					}
					else {
						mean_sum=mean_sum+n%10;
					}
					n=n/10;
				}
					System.out.println("Sum of Extreme Digits: "+extreme_sum);
					System.out.println("Sum of mean Digits: "+mean_sum);
				if(extreme_sum!=mean_sum) {
					System.out.println(num+ "is a phloem number");
				}
				else
				{
					System.out.println(num+ "is not a phloem number");
				}
	}

}
