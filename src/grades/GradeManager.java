package grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/** 
 * A GradeManager will create a command-line prompt that will let someone add grades
 * and display grades in histogram format.
 * 
 */

public class GradeManager {
	
	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade, String> allGrades;
	int size=1,size1=1,size2=1,size3=1,size4=1;
	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade,String>();
		
		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, "");
		}
	}
		
	/**
	 * Adds grade to this GradeManager.
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade, String point) throws InvalidGradeException {
		StringBuffer points = new StringBuffer();
		if (grade.equals("a")) {
			points.append(allGrades.get(LetterGrade.A)+" "+ point);
			allGrades.put(LetterGrade.A,points.toString());
			
		} 
		else if (grade.equals("b")) {
			points.append(allGrades.get(LetterGrade.B)+" "+ point);
			allGrades.put(LetterGrade.B,points.toString());
			
		} 
		else if (grade.equals("c")) {
			points.append(allGrades.get(LetterGrade.C)+" "+ point);
			allGrades.put(LetterGrade.C,points.toString());
			
		} 	
		else if (grade.equals("d")) {
			points.append(allGrades.get(LetterGrade.D)+" "+ point);
			allGrades.put(LetterGrade.D,points.toString());
			
		} 
		else if (grade.equals("f")) {
			points.append(allGrades.get(LetterGrade.F)+" "+ point);
			allGrades.put(LetterGrade.F,points.toString());
			
		} else throw new InvalidGradeException();
		
		// TODO: Add more cases in here
		
		// If grade doesn't match a valid grade, throw an InvalidGradeException
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		try {
			
			System.out.println(getHistString());
		}
		catch(Exception e)
		{
			throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
		}
		
	}
	
	/**
	 * Returns a string representation of the histogram of the grades.
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append( gl + ":" + allGrades.get(gl) + "\n");
					
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in:
	 *    add <some grade> : for example, "add a" or "add b"
	 *                       adds the given grade to the GradeManager
	 *    print            : prints out all the grades in this GradeManager
	 *                       in a histogram format
	 *    exit             : exits the program
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[]  args) throws IOException, InvalidGradeException {
		GradeManager gm = new GradeManager();
		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Starting the grade manager");
		
		while (true) {
			
				String input = cin.readLine();
				if (input.startsWith("add")) {
					String[] str = input.split(" ");
					
					gm.addGrade(str[1], str[2]);
				} 
				else if (input.equals("print")) {
					gm.printHistogram();
				}  
				else if (input.equals("exit")) {
					break;
			}
			
		}
	}

}