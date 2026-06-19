/*
Question 10: Write a Java program to calculate the area of an equilateral triangle.
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.
*/

import java.util.*;

class EquilateralTriangle
{
	public static void main (String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Side");
		
		int side = xyz.nextInt();
		double Area = ((Math.sqrt(3) / 4) * (side * side));
		
		System.out.println("Area =" + Area);
		
	}
	
	
}