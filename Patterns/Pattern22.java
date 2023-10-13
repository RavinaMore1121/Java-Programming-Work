
package Patterns;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			char ch='a';
			for(int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print(ch);
					ch++;
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
