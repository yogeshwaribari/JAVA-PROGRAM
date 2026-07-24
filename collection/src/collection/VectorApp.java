package collection;
import java.util.*;
public class VectorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println("Initally Capacity of Vector :"+v.capacity());
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
		System.out.println("After Capacity of vector :"+v.capacity());

	}

}
