package Patterns;
public class Pattern26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>=j)
				{
					if(n>5)
					{
						n=1;
					}
					System.out.print(n);
					n++;
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