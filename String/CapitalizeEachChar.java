package String;
import java.util.Scanner;
public class CapitalizeEachChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String [] sch=str.split(" ");
		for(int i=0;i<sch.length;i++)
		{
			char [] c=sch[i].toCharArray();
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char) (c[i]-32);
			}
		}
	}

}
