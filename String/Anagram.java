package String;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Race==care; heart==earth
		//first Sort it then compare
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First string:");
		String str1=sc.nextLine();
		System.out.println("enter Second string:");
		String str2=sc.nextLine();
		boolean b=false;
		char [] ch2=new char[str2.length()];
		char [] ch=new char[str1.length()];
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length()-1;i++)
			{
				ch=str1.toCharArray();
				for(int k=0;k<ch.length;k++)
				{
					for(int j=0;j<ch.length-1;j++)
					{
						if(ch[j]>ch[j+1])
						{
							char temp=ch[j];
							ch[j]=ch[j+1];
							ch[j+1]=temp;
						}
					}
				}
			}
			for(int l=0;l<str1.length()-1;l++)
			{
				ch2=str2.toCharArray();
				for(int m=0;m<ch2.length;m++)
				{
					for(int n=0;n<ch2.length-1;n++)
					{
						if(ch2[n]>ch2[n+1])
						{
							char temp=ch2[n];
							ch2[n]=ch2[n+1];
							ch2[n+1]=temp;
						}
					}
				}
			}
//			for(char el:ch)
//			{
//				System.out.print(el+" ");
//			}
//			for(char el2:ch2)
//			{
//				System.out.print(el2+" ");
//			}
			for(int i=0;i<str1.length();i++) {
				if(ch[i]==ch2[i]) {
					b=true;
					continue;
				}
				else
				{
					b=false;
					break;
				}
			}
			if(b==true)
			{
				System.out.println("*Anagram String*");
			}
			else
			{
				System.out.println("Not Anagram String!!!");
			}
		}	
		else
		{
			System.out.println("Length Not Matching!!!");
		}
	}
}