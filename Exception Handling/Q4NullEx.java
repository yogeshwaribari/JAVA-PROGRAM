/*Question 4: Write a Java program to handle NullPointerException.

Create a string variable and assign null value. Try to find its length and handle the 
exception using try-catch block.
Asked In Practice Assignment
Input:
String value: null

Output:
Exception occurred: String value is null

Explanation:
NullPointerException occurs when trying to call methods on null reference. When string 
variable is assigned null value and length() method is called, exception is thrown because
 there is no actual string object. Use try-catch to handle this and display appropriate error 
 message. Always check for null before calling methods on objects.*/
 import java.util.*;
 class Q4NullEx
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 String str=null;
		 try
		 {
			 int n=str.length();
		 }
		 catch(NullPointerException ex)
		 {
			 System.out.println("Exception occurred: String value is null");
			 System.out.println("Error :"+ex);
		 }
		 }
 }