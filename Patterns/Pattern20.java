package Patterns;
public class Pattern20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
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
				}
			}
			System.out.println();
		}
	}
}