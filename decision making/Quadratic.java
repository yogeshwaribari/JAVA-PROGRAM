/*
Question 28: Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a
 quadratic equation using if else in java programming.
Input:
a = 8
b = -4
c = -2

Output:
Root1 = 0.80
Root2 = -0.30

Explanation:
D = (-4)² - 4(8)(-2)
D = 16 + 64 = 80

Since D > 0, two distinct real roots exist.
Roots are calculated using quadratic formula.
*/
import java.util.Scanner;
class Quadratic
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Three Number");
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		double D= (b*b)-(4*a*c);
		if(D>0)
		{
			double r1 = (-b+Math.sqrt(D))/(2*a);
			double r2 = (-b-Math.sqrt(D))/(2*a);
			System.out.println("Root1 = "+ r1 + "\nRoot2 ="+r2);
		}
		else if(D==0)
		{
			double r = -(b)/(2.0*a);
			System.out.println("Equal root = "+r);
		}
		else{
			System.out.println("Not Valid");
		}
	}
}

