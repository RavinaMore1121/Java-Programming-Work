package Exceptions;

public class SalaryException extends Exception{

	public String getMessage() 
	//getMessage() is method of exception class
	{
		// TODO Auto-generated method stub
		return " salary cannot be negative";
	}

}
