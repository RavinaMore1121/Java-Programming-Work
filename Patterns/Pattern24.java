package Patterns;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			int n=1;
			char ch='a';
			for(int j=0;j<5;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(n);
						n++;
					}
					else {
						System.out.print(ch);
						ch++;
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
