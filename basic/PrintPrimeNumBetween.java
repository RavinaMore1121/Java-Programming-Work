package basic;
public class PrintPrimeNumBetween {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Incomplete
		int num1=10;
		int num2=80;
		for(int i=num1;i<=num2;i++) 
		{
			int num = i ;
			int count = 0 ;
			for(int j=1;j<=num;j++)
			{          
				if(num%j==0)
				{
					count ++ ;
				}
			}
			if(count == 2) {
				System.out.println(num);
			}
		}
	}
}