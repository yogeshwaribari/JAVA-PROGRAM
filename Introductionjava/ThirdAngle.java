/*
Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70
*/

import java.util.*;

class ThirdAngle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Two Angles");
		
		int Angle1 = xyz.nextInt();
		int Angle2 = xyz.nextInt();
		//int Angle3 = 180-(Angle1+Angle2);
		
		System.out.println("Angle3=" + (180-(Angle1+Angle2)));
	}
}