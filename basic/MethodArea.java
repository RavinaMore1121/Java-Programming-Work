package basic;
import java.util.Scanner;
public class MethodArea {
	public static double area(double s)
	{
		double areas=s*s;
		return areas;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side");
		double s=sc.nextDouble();
		double d=area(s);
		System.out.println(d);
	}
}