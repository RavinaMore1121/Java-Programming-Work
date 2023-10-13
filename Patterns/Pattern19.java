package Patterns;
public class Pattern19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		char ch='a';
		int n=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(flag)
				{
					if(n>9)
					{
						n=1;
					}
					System.out.print(n++);
					n=n+1;
					flag=false;
				}
				else
				{
					System.out.print(ch++);
					flag=true;
				}
			}
			flag=true;
			System.out.println();
		}
	}
}