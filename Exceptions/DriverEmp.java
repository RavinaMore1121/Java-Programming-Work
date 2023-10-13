package Exceptions;
public class DriverEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee e1=new Employee("Tinku",100000);
			System.out.println(e1);
			//e1.toString() called implicitly whenever we print object ref variable 
			Employee e2=new Employee("Rinku",-100000);
			System.out.println(e2);
		}
		catch(SalaryException e) {
			System.out.println(e.getMessage());
		}
	}
}