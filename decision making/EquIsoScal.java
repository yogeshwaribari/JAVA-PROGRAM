/*
Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene
*/
import java.util.*;
class EquIsoScal
{
	public static void main(String x[])
	{
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter Three Side of Triangle");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		if(a==b && b==c && a==c)
		{
			System.out.println("Equilateral");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Isosceles");
		}
		else{
			System.out.println("Scalene");
		}
	}
}