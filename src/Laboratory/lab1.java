/**
 * 
 */
package Laboratory;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * @author Yukino
 *
 */
<<<<<<< HEAD
public class lab1<T>
=======
public abstract class lab1<T> 
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
{
<<<<<<< HEAD
	@SuppressWarnings("unchecked")
	public void main(String[] args) 
=======
	List<T> list = new List<>();
	@SuppressWarnings("unchecked")
	class List<T> 
	{
		boolean add(T e) {
			return false;
		}
		void add(int index, T element) {
		}
		int	indexOf(Object o) {
			return 0;
		}
		T	remove(int index) {
			return null;
		}
		void sort(Comparator<? super T> c) {
		}
		<T> T[]	toArray() {
			return null;
		}
		int	size() {
			return 0;
		}
		T	get(int index) {
			return null;
		}
	}
	public void add(List<T>list)
	{
		System.out.print("Жагсаалтад хэдэн тоо нэмэх вэ? \n ------------------------------------------- \n");
		Scanner s4 = new Scanner(System.in);
		int addcon = s4.nextInt();
		System.out.print("Жагсаалтад нэмэх дурын " + addcon + " тоогоо оруулна уу\n ------------------------------------------- \n");
		for(int i=0; i<addcon; i++) 
		{
			Scanner s2 = new Scanner(System.in);
			T add = (T) s2.nextLine();
			list.add(add);
		}
	}
	public void display(List<T>list) {
		System.out.print("Жагсаалт: \n");
		System.out.println(Arrays.toString(list.toArray()));
		System.out.print("\n ------------------------------------------- \n");
	}
	public void random(List<T>list) {
		System.out.print("Жагсаалтад хэдэн тоо нэмэх вэ? \n ------------------------------------------- \n");
		Scanner s5 = new Scanner(System.in);
		int randomcon = s5.nextInt();
		for(int i=0; i<randomcon; i++) 
		{				
			list.add((T)(Math.random()* 10));
		}
		System.out.print("Жагсаалтад " + randomcon + " ширхэг санамсаргүй тоо нэмлээ \n ------------------------------------------- \n");
	}
	public void remove(List<T>list)
	{
		System.out.print("Жагсаалтас устгах тоогоо оруулна уу \n");
		Scanner s3 = new Scanner(System.in);
		int del = s3.nextInt();
		int pos = list.indexOf(del);
		list.remove(pos);
		System.out.print("Жагсаалтаас " + del +" тоо устгагдлаа \n ------------------------------------------- \n");
	}
	@SuppressWarnings("unchecked")
	public void sortmintomax(List<T>list)
	{
		Collections.sort((java.util.List<T>) list);
        for(int i=0; i<list.size();i++ )
        {
            list.get(i);
        }
		System.out.print("Жагсаалт багаас их рүү эрэмбэлэгдлээ: \n");
		System.out.println(Arrays.toString(list.toArray()));
		System.out.print("\n ------------------------------------------- \n");
	}
	@SuppressWarnings("unchecked")
	public void maxtomin(List<T>list)
	{
		Collections.sort((java.util.List<T>) list, Collections.reverseOrder());
        for(int i=0; i<list.size();i++ )
        {
            list.get(i);
        }
		System.out.print("Жагсаалт ихээс багаруу эрэмбэлэгдлээ: \n");
		System.out.println(Arrays.toString(list.toArray()));
		System.out.print("\n ------------------------------------------- \n");
	}
	public static void main(String[] args) 
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
	{
<<<<<<< HEAD
	List<T> list = new ArrayList();
=======
		 
	
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
	int function;
	do 
	{
		System.out.print
<<<<<<< HEAD
		("1 - Jagsaaltad too nemeh "
				+ "\n2 - Jagsaaltig harah"
				+ "\n3 - Jagsaaltig sanamsargui toogoor duurgeh"
				+ "\n4 - Jagsaaltaas too hasah"
				+ "\n5 - Jagsaaltig bagaas ih ruu erembelne"
				+ "\n6 - Jagsaaltig ihees baga ruu erembelne"
				+ "\n0 - Duusgah"
=======
		("1 - Жагсаалтад тоо Нэмэх "
				+ "\n2 - Жагсаалтыг харах"
				+ "\n3 - Жагсаалтыг санамсаргүй тоогоор дүүргэх"
				+ "\n4 - Жагсаалтаас тоо хасах"
				+ "\n5 - Жагсаалтыг багаас их рүү эрэмбэлнэ"
				+ "\n6 - Жагсаалтыг ихээс бага руу эрэмбэлнэ"
				+ "\n0 - Дуусгах"
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
				+ "\n ------------------------------------------- \n");
		Scanner s1 = new Scanner(System.in);
		function = s1.nextInt();
		if(function== 1) 
		{
<<<<<<< HEAD
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
=======
			list.add();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
		else if(function == 2) 
		{
<<<<<<< HEAD
			System.out.print("Jagsaalt: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
=======
			list.display();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
		else if(function == 3) 
		{
<<<<<<< HEAD
			System.out.print("Jagsaaltad heden too nemeh ve \n ------------------------------------------- \n");
			Scanner s5 = new Scanner(System.in);
			int randomcon = s5.nextInt();
			for(int i=0; i<randomcon; i++)
			{				
				list.add((int)(Math.random()* 10), null);
			}
			System.out.print("Jagsaaltad " + randomcon + " shirher sanamsargui too nemegdlee \n ------------------------------------------- \n");
=======
			list.random();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
		else if(function == 4) 
		{
<<<<<<< HEAD
			System.out.print("Jagsaaltaas hasah toogoo oruulna uu \n");
			Scanner s3 = new Scanner(System.in);
			int del = s3.nextInt();
			int pos = list.indexOf(del);
			list.remove(pos);
			System.out.print("Jagsaaltaas " + del +" too ustgagdlaa \n ------------------------------------------- \n");
=======
			list.remove();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
		else if(function == 5) 
		{
<<<<<<< HEAD
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
=======
			list.sortmintomax();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
		else if(function == 6) 
		{
<<<<<<< HEAD
			Collections.sort(list, Collections.reverseOrder());
	        for(int i=0; i<list.size();i++ )
	        {
	            list.get(i);
	        }
			System.out.print("Jagsaalt ihees baga ruu erembelegdlee: \n");
			System.out.println(Arrays.toString(list.toArray()));
			System.out.print("\n ------------------------------------------- \n");
=======
			list.maxtomin();
>>>>>>> branch 'master' of https://github.com/munkhuu58/CS311.git
		}
	}while(function!=0);	
	}
	
	
}
