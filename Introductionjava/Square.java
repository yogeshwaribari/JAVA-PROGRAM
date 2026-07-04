/*
Take a number from the user and print its square.
*/

import java.util.*;

class Square{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = xyz.nextInt();
		System.out.println("Square =" +a*a);
	}
}
