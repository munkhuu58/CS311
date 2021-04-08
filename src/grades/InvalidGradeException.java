package grades;

/**
 * Exception that should be thrown if an invalid grade is passed in.
 *
 */
public class InvalidGradeException extends Exception 
{
	private static final long serialVersionUID = 1;
	
	public InvalidGradeException() 
	{
		
	}
	
	public InvalidGradeException(String grade) 
	{
		System.out.print("Invalid grade. Available grades: a,b,c,d,f");
	}
	
	public InvalidGradeException(int point) 
	{
		System.out.print("Invalid point. Please insert point between 0 - 100");
	}
	
	public static boolean pointCheck(int point) 
	{
		boolean error = false;
		if(point <0 || point > 100)
		{
			error = true;
		}
		return error;
	}	
}