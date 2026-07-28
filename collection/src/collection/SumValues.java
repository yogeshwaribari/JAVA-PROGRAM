package collection;
import java.util.*;
public class SumValues {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		int sum=0;
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			sum=sum+(int)obj;
			
		}
		System.out.println("Sum :"+sum);

	}

}
