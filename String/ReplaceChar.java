package String;
import java.util.Scanner;
public class ReplaceChar {
	//replace a particular character in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First string:");
		String str=sc.nextLine();
		System.out.println();
		System.out.println("Enter a Character which you want to replace?");
		char c=sc.next().charAt(0);
		System.out.println("Enter a Character you want to replace with?");
		char cr=sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char [] ch=str.toCharArray();
			if(ch[i]==c)
			{
			//	System.out.println(str.replaceAll('c','cr'));
			}
		}
	}

}
