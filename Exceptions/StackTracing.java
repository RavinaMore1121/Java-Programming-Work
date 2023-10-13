package Exceptions;
public class StackTracing {

	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		try {
			m1();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
			//it traces exception object propagation from top of the 
			//stack to bottom of the stack(object travelling)
			//return type is "void"
			//gives original exception as it is, so that can solve problem
			System.out.println("===[Reason: "+e.getMessage()+"]===");
			//return type is string
			//it returns reason behind the exception
		}
		System.out.println("Main ends");
	}
}