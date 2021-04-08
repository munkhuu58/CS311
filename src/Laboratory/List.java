package Laboratory;

import java.util.Comparator;

public interface List<T> 
	{
		boolean add(T e);
		void add(int index, T element);
		int	indexOf(Object o);
		T	remove(int index);
		void sort(Comparator<? super T> c);
	}

