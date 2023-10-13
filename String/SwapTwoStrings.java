package String;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First string:");
		String str1=sc.nextLine();
		System.out.println("enter Second string:");
		String str2=sc.nextLine();
		String str3="";
		str3=str1;
		str1=str2;
		str2=str3;
		System.out.println("String1:"+str1);
		System.out.println("String2:"+str2);
	}

}
