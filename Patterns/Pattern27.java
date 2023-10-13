package Patterns;
public class Pattern27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int c=2;
		for(int i=0;i<4;i++)
		{
			int n=num;
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
					System.out.print(n--);
					//--n;
					//n=n+2;
				}
				else
				{
					System.out.print(" ");
				}
			}
			num=num+c;
			c++;
			System.out.println();
		}
	}
}