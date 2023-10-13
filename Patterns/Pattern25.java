package Patterns;
public class Pattern25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean flag=true;
		char ch='a';
		int n=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(ch);
						ch++;
					}
					else 
					{
						System.out.print(n);
						n++;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}