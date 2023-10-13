package String;
import java.util.Scanner;
public class PrintGIvenFormat {
	//hello => hELLO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		//String[] str1=str.split(" ");
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1)== ' ') {
				System.out.print((str.charAt(i)+"").toLowerCase());
			}
			else {
				System.out.print((str.charAt(i)+"").toUpperCase());
			}
		}
	}

}
