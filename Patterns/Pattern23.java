package Patterns;
public class Pattern23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		for(int i=1;i<=5;i++)
		{
			char ch1 = ch ;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch1++);
						
			}
			System.out.println();
			ch++ ;
		}
	}
}
//a
//bc
//cde
//defg
//efghi