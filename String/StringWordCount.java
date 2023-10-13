package String;

import java.util.Scanner;

public class StringWordCount {
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
String str=sc.nextLine();
String [] s=str.split(" ");
int count=0;
for(int i=0;i<s.length;i++)
{
count++;
}	
System.out.println(count);
}
}
