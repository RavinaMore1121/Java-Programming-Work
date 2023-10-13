package basic;
import java.util.Scanner;
public class ScanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		System.out.println("Entered Number : "+num);
		
		System.out.println("Enter a Double value :");
		double d= sc.nextDouble();
		System.out.println("Entered Double value : "+d);
		
		System.out.println("Enter a String");
		String s1=sc.next();
		System.out.println("Entered String : "+s1);
		
		System.out.println("Enter a String Line");
		String s2=sc.nextLine();
		System.out.println("Entered String is : "+s2);
		
		System.out.println("Enter a Character");
		char c=sc.next().charAt(0);
		System.out.println("Entered Character is : "+c);
	}

}

