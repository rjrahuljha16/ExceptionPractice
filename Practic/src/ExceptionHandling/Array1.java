package ExceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
public static void main(String[] args) {
final ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(10);
al.add(5);
Iterator<Integer> itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	System.out.println("--");
}
al.set(5, 300);
System.out.println(al.get(5)+"-----");

	}
}
