package collection;
import java.util.*;
public class VInitialCapacityIncrement {

	public static void main(String[] args) {
		
		Vector v=new Vector(4,3);
		System.out.println("Initially capacity of vector :"+v.capacity());
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
		System.out.println("After capacity of vector :"+v.capacity());
		

	}

}
