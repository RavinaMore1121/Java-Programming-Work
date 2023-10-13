package String;
import java.util.Scanner;
public class DuplicateCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String: ");
		String str=sc.nextLine();
		String [] s=str.split(" ");
		for(int i=0;i<str.length();i++)
		{
			char [] ch=s[i].toCharArray();
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate Character Found: "+ch[i]);
				}
				else
				{
					System.out.println("No duplicate Found");
				}
			}
		}
	}

}
