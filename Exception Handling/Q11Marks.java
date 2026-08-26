/*Question 11: Write a Java program to create a custom exception for invalid marks.

Accept student marks. If marks are greater than 100 or less than 0, throw user defined exceptions.
Asked In Practice Assignment
Input:
Enter marks: 120

Output:
Invalid Marks Exception

Explanation:
Custom exceptions extend Exception and are created for domain-specific errors.
 When marks (120) exceed valid range (0-100), custom exception is thrown for InvalidMarks.
 This provides meaningful error information specific to marks validation. Implementing custom 
 exceptions allows developers to define application-specific error types for better error handling
 and clearer code intent.*/
 import java.util.*;
 class Q11Marks
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Marks");
		 int marks=xyz.nextInt();
		 try
		 {
			 if(marks>100 || marks<0)
			 {
				 throw new Exception("Invalid Marks Exception");
			 }
			 else
			 {
				 System.out.println("Marks :"+marks);
			 }
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
	 }
 }