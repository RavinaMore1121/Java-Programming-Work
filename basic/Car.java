package basic;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Price of Car");
		double price=sc.nextDouble();
		double Tax=0;
		if(price<=500000)
		{
			Tax=5;
	    	//double result=;
			System.out.println("Tax to be paid: "+(Tax/100)*price);
		}
	    if(price<=500000 && price>=1000000)
	    {
	    	Tax=10;
	    	//double result=(Tax/100)*price;
	    	System.out.println("Tax to be paid: "+(Tax/100)*price);
	    }
		
		if(price >=1000000) {
			Tax=20;
			//double result=(Tax/100)*price;
			System.out.println("Tax to be paid: "+(Tax/100)*price);
		}
		
	}

}
