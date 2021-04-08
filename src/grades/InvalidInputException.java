package grades;

public class InvalidInputException extends Exception
{

	private static final long serialVersionUID = 1L;

	public InvalidInputException() 
	{
		System.out.print("Invalid input. Available input: add, print, exit \n");
	}
}
