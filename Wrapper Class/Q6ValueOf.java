/*Question 6: Write a Java program to convert an integer stored in a wrapper class into a 
primitive datatype and display both values.
Asked In Practice Assignment
Input:
Enter Integer value: 25

Output:
Wrapper value: 25
Primitive value: 25

Explanation:
Read integer value 25. Create Integer wrapper object (can use valueOf() or autoboxing). 
Convert wrapper object to primitive int using intValue() method. Display both values showing 
they contain same numeric value but different types. Wrapper is Integer class, primitive is int 
type.*/
import java.util.*;
class Q6ValueOf
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Integer value");
		Integer a=xyz.nextInt();
		System.out.println("Wrapper value :"+a);
		int b=a.intValue();
		System.out.println("Primitive value :"+b);
	}
}