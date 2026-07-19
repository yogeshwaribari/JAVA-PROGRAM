 /*
Find the largest number among three numbers.
*/

import java.util.*;

class LargestThree
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two Number");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		
		System.out.println( "Largest = " + ((a > b) ? (a > c ? a : c) : (b > c ? b : c)));
	}
}