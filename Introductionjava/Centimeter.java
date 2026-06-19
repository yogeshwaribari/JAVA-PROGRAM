/*
Question 6: Write a Java program to convert length from centimeter into meter and kilometer.'
Input:
Centimeter = 150
Output:
Meter = 1.5
Kilometer = 0.0015
Explanation:
1 meter = 100 centimeters
1 kilometer = 100000 centimeters
The given value is converted using standard unit conversion formulas
https://docs.google.com/document/d/1QocWXkz1rYAdRqC81XdLLY_B3KkyKlQKk9ZOxe8zA7A/edit?tab=t.0

*/

class Centimeter
{
	public static void main (String x[])
	{
		int C = Integer.parseInt(x[0]);
		float Meter = C/100;
		double k = C*Meter/100000;
		
		System.out.println("Meter = " + Meter + "\nKilometer = " + k);
		
	
		
	}
}