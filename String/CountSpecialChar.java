package String;
import java.util.Scanner;
public class CountSpecialChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int Vcount=0,Ccount=0,Scount=0,Spcount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' &&ch<='z') {
				if(ch=='A'||ch=='a'|| ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
				{
					Vcount++;
				}
				else
				{
					Ccount++;
				}
			}
			else if(ch==' ')
			{
				Scount++;
			}
			else {
				Spcount++;
			}
		}
		System.out.println("Vowels: " +Vcount);
		System.out.println("Consonants: " +Ccount);
		System.out.println("Spaces: "+Scount);
		System.out.println("Spcount: "+Spcount);
	}

}
//remove white spaces in string
//find even length word in a sentence
//wap to calculate the sum of digits in a string e.g. hgg3i5v6 o/p =14
//count how many words start with vowel