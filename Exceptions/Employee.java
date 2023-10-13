package Exceptions;
public class Employee {
	String name;
	double salary;
	Employee(String name, double salary) throws SalaryException
	{
		this.name=name;
		if(salary>0)
		{
			this.salary=salary;
		}
		else
		{
			throw new SalaryException();
		}
	}
	//********to get state instead of address use toString()********
	public String toString()
	{
		return "Name :"+name+",Salary: "+salary;
	}

}
