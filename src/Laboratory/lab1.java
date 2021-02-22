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
public class lab1 
{
	public static void main(String[] args) 
	{
	List<Integer> list = new ArrayList();
	int function;
	do 
	{
		System.out.print
		("1 - Жагсаалтад тоо нэмэх "
				+ "\n2 - Жагсаалтыг харах"
				+ "\n3 - Жагсаалтыг санамсаргүй тоогоор дүүргэх"
				+ "\n4 - Жагсаалтаас тоо хасах"
				+ "\n5 - Жагсаалтыг багаас их рүү эрэмбэлнэ"
				+ "\n6 - Жагсаалтыг ихээс бага руу эрэмбэлнэ"
				+ "\n0 - Дуусгах"
				+ "\n ------------------------------------------- \n");
		Scanner s1 = new Scanner(System.in);
		function = s1.nextInt();
		if(function== 1) 
		{
			System.out.print("Жагсаалтад хэдэн тоо нэмэх вэ? \n ------------------------------------------- \n");
			Scanner s4 = new Scanner(System.in);
			int addcon = s4.nextInt();
			System.out.print("Жагсаалтад нэмэх дурын " + addcon + " тоогоо оруулна уу\n ------------------------------------------- \n");
			for(int i=0; i<addcon; i++) 
			{
				Scanner s2 = new Scanner(System.in);
				int add = s2.nextInt();
				list.add(add);
			}
		}
		else if(function == 2) 
		{
			System.out.print("Жагсаалт: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
		}
		else if(function == 3) 
		{
			System.out.print("Жагсаалтад хэдэн тоо нэмэх вэ? \n ------------------------------------------- \n");
			Scanner s5 = new Scanner(System.in);
			int randomcon = s5.nextInt();
			for(int i=0; i<randomcon; i++) 
			{				
				list.add((int)(Math.random()* 10));
			}
			System.out.print("Жагсаалтад " + randomcon + " ширхэг санамсаргүй тоо нэмлээ \n ------------------------------------------- \n");
		}
		else if(function == 4) 
		{
			System.out.print("Жагсаалтас устгах тоогоо оруулна уу \n");
			Scanner s3 = new Scanner(System.in);
			int del = s3.nextInt();
			int pos = list.indexOf(del);
			list.remove(pos);
			System.out.print("Жагсаалтаас " + del +" тоо устгагдлаа \n ------------------------------------------- \n");
		}
		else if(function == 5) 
		{
			Collections.sort(list);
	        for(int i=0; i<list.size();i++ )
	        {
	            list.get(i);
	        }
			System.out.print("Жагсаалт багаас их рүү эрэмбэлэгдлээ: \n");
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
			System.out.print("Жагсаалт ихээс багаруу эрэмбэлэгдлээ: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
		}
	}while(function!=0);	
	}
}
