package collection;
import java.util.*;
public class VectorInitialCapacity {
	public static void main(String x[])
	{
		Vector v=new Vector(4);
		System.out.println("Initially Capacity of vector :"+v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
		System.out.println("Size :"+v.size());
		System.out.println("After capacity of vector :"+v.capacity());//capacity double (2x) 4-->8-->16-->32
	}

}
