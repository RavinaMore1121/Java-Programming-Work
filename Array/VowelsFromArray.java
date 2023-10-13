package Array;
import java.util.Scanner;
public class VowelsFromArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		char c;
		char [] ch=new char[size];
		for(int i=0;i<size;i++)
		{
			c=sc.next().charAt(0);
			ch[i]=c;
		}
		for(int i=0;i<size;i++)
		{
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.println(ch[i]);
			}
		}
	}
}