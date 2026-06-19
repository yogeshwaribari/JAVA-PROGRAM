/*
Q8. Write a program to check traingle is equilatral , isoscale or scalene. 
*/
import java.util.Scanner;
class Q8
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Three Side of Triangle");
		int s1 = xyz.nextInt();
		int s2 = xyz.nextInt();
		int s3 = xyz.nextInt();
		if(s1==s2 && s2==s3)
		{
			System.out.println("equilatral"); //three sides are equal
		}
		else if(s1==s2 || s2==s3 ||s1==s3)
		{
			System.out.println("Isoscale"); // two sides are equal
		}
		else{
			System.out.println("scalene"); // all sides different 
		}
	}
}