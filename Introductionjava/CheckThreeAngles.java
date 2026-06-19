/*
Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
Input:
Angle1 = 60
Angle2 = 60
Angle3 = 60

Output:
Valid Triangle

Explanation:
A triangle is valid only if the sum of all three angles is exactly 180°.
60 + 60 + 60 = 180, so it is valid.
*/

import java.util.*;
class CheckThreeAngles
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter three Angles");
		
		
		int A1 = xyz.nextInt();
		int A2 = xyz.nextInt();
		int A3 = xyz.nextInt();
		System.out.println("Angle1 =" + A1 + "\nAngle2 =" + A2 +"\nAngle3 =" +A3);
		String msg = ((A1+A2+A3)==180) ? "Valid Triangle" : "Not Valid Triangle";
		System.out.println(msg);
	}
}