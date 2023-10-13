package Array;
public class IdenticalELement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3};
		int [] arr2= {1,2,3};
		boolean b=elementidentical(arr1,arr2);
		System.out.println(b);
	}
	public static boolean elementidentical(int []a, int []b) 
	{
		boolean identical=false;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					identical=true;
				}
				else
				{
					 identical=false;
					 break;
				}
			}
		}
		return identical;
	}
}