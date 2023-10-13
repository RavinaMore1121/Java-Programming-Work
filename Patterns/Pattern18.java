package Patterns;
public class Pattern18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{ 
				if(i==j)
				{
					System.out.print(ch);
					ch++;
				}
				else if(i==4||j==4 || j==0 || i==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}