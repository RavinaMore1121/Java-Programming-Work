package String;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class FindOccuranceofWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1=sc.nextLine();
		String [] s1=str1.split(" ");
		String el=" ";
		System.out.println(Arrays.toString(s1));
		TreeSet<String>ts=new TreeSet<String>();
		//to add string to treeset
		for(int i=0;i<s1.length;i++)
		{
			ts.add(s1[i]);
		}
		//check and count
		for(String el1:ts)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(el1.equals(s1[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(el1+ " "+count);
			}
		}
	}
}