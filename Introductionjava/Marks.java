/*
Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total ÷ 5.
*/
 
 import java.util.*;
 
 class Marks
 {
	public static void main (String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Five Subject Marks");
		
		int m1 = xyz.nextInt(), 
			m2 = xyz.nextInt(), 
			m3 = xyz.nextInt(), 
			m4 = xyz.nextInt(),
			m5 = xyz.nextInt();
		int total = m1 + m2 + m3 + m4 + m5;
		int percentage = total/5;
		
		System.out.println("Total = " + total);
		System.out.println("Percentage =" + percentage + "%");
		
		
	}
 }
