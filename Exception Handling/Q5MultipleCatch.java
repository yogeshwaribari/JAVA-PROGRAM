/*Question 5: Write a Java program to demonstrate multiple catch blocks.

Accept two numbers and perform division and also store the result in an array. 
Handle both ArithmeticException and ArrayIndexOutOfBoundsException separately.
Asked In Practice Assignment
Input:
Enter number1: 20
Enter number2: 0

Output:
Arithmetic Exception handled

Explanation:
Multiple catch blocks allow handling different exception types differently. 
First catch block handles ArithmeticException for division by zero. Second catch block 
handles ArrayIndexOutOfBoundsException for invalid array access. Each block provides specific
 error handling for its exception type.*/
 import java.util.*;
 class Q5MultipleCatch
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Number 1");
		 int a=xyz.nextInt();
		 System.out.println("Enter Number 2");
		 int b=xyz.nextInt();
		 int res[]=new int[1];
		 try{
			 res[0]=a/b;
			 System.out.println("Result : "+res[0]);
		 }
		 catch(ArithmeticException ex)
		 {
			 System.out.println("Arithmetic Exception handled");
		 }
		 catch(ArrayIndexOutOfBoundsException ex)
		 {
			 System.out.println("Array Index Out Of Bounds Exception handled");
		 }
	 }
 }