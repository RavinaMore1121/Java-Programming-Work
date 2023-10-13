package basic;
import java.util.Scanner;
public class AreaOfCircle {
	public static double Circle(double r,double pi) {
		double area=(2*pi*(r*r));
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		double r=sc.nextDouble();
		double pi=3.14;
		double area=Circle(r,pi);
		System.out.println("Area of Circle: "+area);
	}

}
