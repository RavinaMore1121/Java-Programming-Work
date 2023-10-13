package String;
import java.util.Scanner;
public class SwapWithout3rd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First string:");
		String str1=sc.nextLine();
		System.out.println("enter Second string:");
		String str2=sc.nextLine();
		str1=str1+str2;
		//System.out.println(str1);
		str2=str1.substring(0,str1.length()-str2.length());
		//System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println("After Swapping:");
		System.out.println("First String: "+str1);
		System.out.println("second String: "+str2);
	}

}
