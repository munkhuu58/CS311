package grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GradeManager 
{
	
	private HashMap<LetterGrade, String> allGrades;
	int size=1,size1=1,size2=1,size3=1,size4=1;

	public GradeManager() 
	{
		this.allGrades = new HashMap<LetterGrade,String>();
		
		for (LetterGrade gl : LetterGrade.values()) 
		{
			allGrades.put(gl, "");
		}
	}
		
	public void addGrade(String grade, String point) throws InvalidGradeException 
	{
		int intPoint = Integer.parseInt(point);
		boolean pointError = InvalidGradeException.pointCheck(intPoint);
		StringBuffer points = new StringBuffer();
		if(pointError) 
		{
			throw new InvalidGradeException(intPoint);
		}
		if (grade.equals("a")) 
		{
			points.append(allGrades.get(LetterGrade.A)+" "+ point);
			allGrades.put(LetterGrade.A,points.toString());			
		} 
		else if (grade.equals("b")) 
		{
			points.append(allGrades.get(LetterGrade.B)+" "+ point);
			allGrades.put(LetterGrade.B,points.toString());			
		} 
		else if (grade.equals("c")) 
		{
			points.append(allGrades.get(LetterGrade.C)+" "+ point);
			allGrades.put(LetterGrade.C,points.toString());			
		} 	
		else if (grade.equals("d")) 
		{
			points.append(allGrades.get(LetterGrade.D)+" "+ point);
			allGrades.put(LetterGrade.D,points.toString());			
		} 
		else if (grade.equals("f")) 
		{
			points.append(allGrades.get(LetterGrade.F)+" "+ point);
			allGrades.put(LetterGrade.F,points.toString());			
		} 
		else throw new InvalidGradeException(grade);
		
	}

	public void printHistogram() 
	{
		try 
		{			
			System.out.println(getHistString());
		}
		catch(Exception e)
		{
			throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
		}		
	}
	
	public String getHistString() 
	{
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) 
		{
			sb.append( gl + ":" + allGrades.get(gl) + "\n");
					
		}
		return sb.toString();
	}

	public static void main(String[]  args) throws IOException, InvalidGradeException, InvalidInputException
	{
		System.out.print("Available input: "
				+ "\n To add grade: add 'grade' 'point' \n Available Grade and Points "
				+ "\n A | 90 - 100 \n B | 80 - 89 \n C | 70 - 79 \n D | 60 - 69 \n F | 00 - 59 \n"
				+ " To print grades: print"
				+ "\n To see example: example"
				+ "\n To exit: exit \n"
				+ "\n Starting the grade manager \n");
		GradeManager gm = new GradeManager();		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			while (true) 
			{			
				String input = cin.readLine();
				if (input.startsWith("add")) 				
				{							
					String[] str = input.split(" ");					
					gm.addGrade(str[1], str[2]);
				} 
				else if (input.equals("print")) 
				{
					gm.printHistogram();
				}
				else if (input.equals("example")) 
				{
					System.out.print("Example: \n "
							+ "add a 90 \n"
							+ " add b 89 \n"
							+ " print \n exit");
				}
				else if (input.equals("exit")) 
				{
					break;
				}
				else 
				{
					throw new InvalidInputException();							
				}
			}
		}
		catch(Exception InvalidInputException)
		{
			System.out.print("Try again");		
		}
	}
}