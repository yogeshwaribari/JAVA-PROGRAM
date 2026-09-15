/*Question 4: Write a Java program to swap two Integer values using autoboxing and unboxing.
Asked In Practice Assignment
Input:
Enter first number: 25
Enter second number: 75

Output:
Before swapping: 25 75
After swapping: 75 25

Explanation:
Read two numbers as primitive int. Assign to Integer objects (autoboxing occurs). To swap,
 convert (unbox) to primitive variables, use temporary variable to hold one value, then exchange.
 Display before and after values. Autoboxing allows seamless conversion int ? Integer, unboxing
 allows Integer ? int.*/
 import java.util.*;
 class Q4Swap
 {
	 public static void main(String args[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter first number");
		 int a=xyz.nextInt();
		 System.out.println("Enter Second number");
		 int b=xyz.nextInt();
		 Integer x=a;
		 Integer y=b;
		 System.out.println("Before swapping: "+x+" "+y);
		 int temp=x;
		 x=y;
		 y=temp;
		 System.out.println("After swapping: "+x+" "+y);
	 }
 }