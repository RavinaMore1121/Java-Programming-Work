package String;
import java.util.Scanner;
public class RemoveWhiteSpace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String: ");
		String str=sc.nextLine();
		String s=String.valueOf(str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			String s1=String.valueOf(str.charAt(i));
			String s2=String.valueOf(str.charAt(i-1));

			if(s1.equals(" ")&& s2.equals(" "))
			{
				continue;
			}
			else
			{
				s=s+s1;
			}
		}
			System.out.println(s);
	}
}