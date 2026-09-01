/*Question 20: Write a Java program to handle exceptions in method overriding.

Create parent and child class where the child method handles exceptions properly.
Asked In Practice Assignment
Input:
Enter value: 0

Output:
Exception handled in child class

Explanation:
In method overriding, child method can throw same or narrower exceptions than parent method.
 When child method overrides parent method and handles exceptions, it provides specific error
 handling for zero values. This demonstrates proper exception handling in inheritance hierarchy.
 Child method exception handling refines parent method contract and provides specialized error
 management.*/
 import java.util.*;
 
 class Parent
 {
	 void display(int n)
	 {
		 System.out.println("Parent method");
	 }
 }
 class Child extends Parent
 {
	 void display(int n) 
	 {
		 try{
			 if(n==0)
			 {
				 throw new ArithmeticException("Exception handled in child class");
			 }
		 }
		 catch(ArithmeticException ex)
		 {
			 System.out.println(ex.getMessage());
		 }
	 }
 }
class Q20MethodOverriding
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=xyz.nextInt();
		Child c=new Child();
		c.display(n);
	}
}