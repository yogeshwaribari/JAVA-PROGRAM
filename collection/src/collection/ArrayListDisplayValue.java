
/* Write program to store 5 values in ArrayList and display it */
package collection;
import java.util.*;
public class ArrayListDisplayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Object obj:al)
		{
			System.out.println(obj);
		}

	}

}
