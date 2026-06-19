/*
Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 × radius
Area = ? × r²
Circumference = 2 × ? × r
The formulas are applied using the given radius.

*/

class RadiusCircle
{
	public static void main (String x[])
	{
		int r = Integer.parseInt(x[0]);
		int Diameter = 2*r;
		double Area = 3.14*r*r;
		double Circumference = 2*3.14*r;
		
		System.out.println("Diameter=" + Diameter + "\nArea = " + Area +  "\nCircumference = "+ Circumference );

	}
}