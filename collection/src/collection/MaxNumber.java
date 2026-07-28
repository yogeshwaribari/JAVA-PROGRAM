package collection;
import java.util.*;
public class MaxNumber {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(21);
		v.add(7);
		v.add(14);
		v.add(10);
		v.add(2);
		int max=(int)v.get(0);
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(max<(int)obj)
			{
				max=(int)obj;
			}
		}
		System.out.println("Max :"+max);

	}

}
