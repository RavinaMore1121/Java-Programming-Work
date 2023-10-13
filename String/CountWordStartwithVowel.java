package String;
import java.util.Scanner;
public class CountWordStartwithVowel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		int countV=0;
		String[] strp=str.split(" ");
		for(int i=0;i<strp.length;i++)
		{
			char [] ch=strp[i].toCharArray();
			if(ch[0]=='A' || ch[0]=='E' || ch[0]=='I' || ch[0]=='O' && ch[0]=='U' || ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' && ch[0]=='u') {
				countV++;
			}
		}
		System.out.println("Count of words starts with Vowels: "+countV);
	}

}
