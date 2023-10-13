package basic;
import java.util.Scanner;
public class AreaofRect {
	public static double Rect(double l, double w)
	{
		double area=l*w;
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Length: ");
		double l=sc.nextDouble();
		System.out.println("enter width: ");
		double w=sc.nextDouble();
		double area=Rect(l,w);
		System.out.println("Area of Rectangle: "+area);
	}
}