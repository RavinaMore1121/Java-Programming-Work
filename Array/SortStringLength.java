package Array;
import java.util.Scanner;
public class SortStringLength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str= {"hi","your","you","Program","hello"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j].length()>str[j+1].length())
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		for(String obj:str) {
			System.out.println(obj);
		}
	}
}