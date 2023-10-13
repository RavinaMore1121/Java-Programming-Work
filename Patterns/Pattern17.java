package Patterns;
public class Pattern17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		int n=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i%2==0) 
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(n);
				}
				
			}
			if(i%2==0) 
				ch++;
			else
				n++;
			System.out.println();
		}
	}

}
//AAAAA
//11111
//BBBBB
//22222
//CCCCC