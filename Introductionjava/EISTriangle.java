/*
Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
Input:
Side1 = 5
Side2 = 5
Side3 = 5

Output:
Equilateral Triangle

Explanation:
If all three sides are equal ? Equilateral.
If any two sides are equal ? Isosceles.
If all sides are different ? Scalene
*/
import java.util.*;
class EISTriangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Three Sides");
		int s1 = xyz.nextInt();
		int s2 = xyz.nextInt();
		int s3 = xyz.nextInt();
		
		String msg = ((s1==s2 && s2==s3) ? "Equilateral Triangle" : (s1==s2 || s2==s3 || s1==s3) ? "Isosceles" : "Scalene");
		System.out.println(msg);
		
	}
}