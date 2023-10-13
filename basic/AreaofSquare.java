package basic;

import java.util.Scanner;

public class AreaofSquare {
	public static double Square(double s)
	{
		double area=s*s;
		return area;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		double size=sc.nextInt();
		double area=Square(size);
		System.out.println("Area of Square:"+area);
	}

}
