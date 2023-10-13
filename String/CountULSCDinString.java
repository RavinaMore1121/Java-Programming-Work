package String;

import java.util.Scanner;

public class CountULSCDinString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		int countUC=0,countLC=0,countD=0,countS=0;
		for(int i=0;i<str.length();i++)
		{
			char [] ch=str.toCharArray();
			if(ch[i]>='A' &&ch[i]<='Z')
			{
				countUC++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				countLC++;
			}
			else if(ch[i]>='1' && ch[i]<='9')
			{
				countD++;
			}
			else
			{
				countS++;
			}
		}
		System.out.println("Count of UpperCase Character is:"+countUC);
		System.out.println("Count of LowerCase Character is:"+countLC);
		System.out.println("Count of Digits is:"+countD);
		System.out.println("Count of Special Character is:"+countS);

	}
}