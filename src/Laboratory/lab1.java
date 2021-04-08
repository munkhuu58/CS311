/**
 * 
 */
package Laboratory;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author Yukino
 *
 */
public class lab1<T>
{
	@SuppressWarnings("unchecked")
	public void main(String[] args) 
	{
	List<T> list = new ArrayList();
	int function;
	do 
	{
		System.out.print
		("1 - Jagsaaltad too nemeh "
				+ "\n2 - Jagsaaltig harah"
				+ "\n3 - Jagsaaltig sanamsargui toogoor duurgeh"
				+ "\n4 - Jagsaaltaas too hasah"
				+ "\n5 - Jagsaaltig bagaas ih ruu erembelne"
				+ "\n6 - Jagsaaltig ihees baga ruu erembelne"
				+ "\n0 - Duusgah"
				+ "\n ------------------------------------------- \n");
		Scanner s1 = new Scanner(System.in);
		function = s1.nextInt();
		if(function== 1) 
		{
			System.out.print("Jagsaaltad heden too nemeh ve? \n ------------------------------------------- \n");
			Scanner s4 = new Scanner(System.in);
			int addcon = s4.nextInt();
			System.out.print("Jagsaaltad nemeh durin " + addcon + " toogoo oruulna uu\n ------------------------------------------- \n");
			for(int i=0; i<addcon; i++) 
			{
				Scanner s2 = new Scanner(System.in);
				T add = (T) s2.nextLine();
				list.add(add);
			}
		}
		else if(function == 2) 
		{
			System.out.print("Jagsaalt: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
		}
		else if(function == 3) 
		{
			System.out.print("Jagsaaltad heden too nemeh ve \n ------------------------------------------- \n");
			Scanner s5 = new Scanner(System.in);
			int randomcon = s5.nextInt();
			for(int i=0; i<randomcon; i++)
			{				
				list.add((int)(Math.random()* 10), null);
			}
			System.out.print("Jagsaaltad " + randomcon + " shirher sanamsargui too nemegdlee \n ------------------------------------------- \n");
		}
		else if(function == 4) 
		{
			System.out.print("Jagsaaltaas hasah toogoo oruulna uu \n");
			Scanner s3 = new Scanner(System.in);
			int del = s3.nextInt();
			int pos = list.indexOf(del);
			list.remove(pos);
			System.out.print("Jagsaaltaas " + del +" too ustgagdlaa \n ------------------------------------------- \n");
		}
		else if(function == 5) 
		{
			//Collections.sort((List<T>) list);
	        for(int i=0; i<list.size();i++ )
	        {
	            for(int j = list.size() - 1; j>i; j--) 
	            {
	            	if (list.get(i) > list.get(j)) 
	            	{
	            		int temp = list.get(i);
	            		list.get(i) = list.get(i);
	            		list.get(j) = temp;
	            	}
	            }
	        }
			System.out.print("Jagsaalt bagaas ih ruu erembelegdlee: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
		}
		else if(function == 6) 
		{
			Collections.sort(list, Collections.reverseOrder());
	        for(int i=0; i<list.size();i++ )
	        {
	            list.get(i);
	        }
			System.out.print("Jagsaalt ihees baga ruu erembelegdlee: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
		}
	}while(function!=0);	
	}
}
