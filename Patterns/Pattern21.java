package Patterns;
public class Pattern21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
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
