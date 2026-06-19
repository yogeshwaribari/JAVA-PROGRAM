/*
Question 2: Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
Input:
int = 10
float = 5.5
double = 99.99
char = A
boolean = true

Output:
10
5.5
99.99
A
true

*/

class Datatype
{
	public static void main (String x[])
	{
		int i = Integer.parseInt(x[0]);
		float f = Float.parseFloat(x[1]);
		double d = Double.parseDouble(x[2]);
		char c = x[3].charAt(0);
		boolean bl = Boolean.parseBoolean(x[4]);
		
		System.out.println("integer =" + i + "\nFloat =" + f + "\nDouble =" + d + "\nChar =" + c + "\nBoolean =" + bl);
		
		
		
	}
}

