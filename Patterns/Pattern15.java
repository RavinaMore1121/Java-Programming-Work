package Patterns;
public class Pattern15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				if((i+j>=4) && (j-i<=4) && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
//		*
//	   * *
//	  * * *
//	 * * * *
//	* * * * *