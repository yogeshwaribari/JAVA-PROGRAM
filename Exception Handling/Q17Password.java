/*Question 17: Write a Java program to validate password length using exceptions.

Accept password. If the password length is less than 8, throw an exception.
Asked In Practice Assignment
Input:
Enter password: abc12

Output:
Password must be at least 8 characters

Explanation:
Password validation requires minimum length check. When password "abc12" has only 5 characters 
(less than 8), exception is thrown. Catch block displays message specifying the minimum required
 length for password security.*/
 import java.util.*;
 class Q17Password
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter String");
		 String s=xyz.nextLine();
		 try
		 {
			 int n=s.length();
			 if(n<8)
			 {
				 throw new Exception("Password must be at least 8 characters");
			 }
			 else
			 {
				 System.out.println("Valid Password");
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
 }