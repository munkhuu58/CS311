package grades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GradeManagerTest {

	@Test
	void GradeManagerTesting() {
		GradeManager gm = new GradeManager();
		try 
		{
			gm.addGrade("a", "100");
			gm.addGrade("b", "80");
		}
		catch(Exception InvalidInputException)
		{
			System.out.print("Try again");		
		}
		String s = gm.getHistString();
		System.out.println(s);
		Assert.assertTrue(s.startsWith("A: 100\nB: 80"));
	}

}
