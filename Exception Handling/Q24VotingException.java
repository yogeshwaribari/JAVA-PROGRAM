/*Question 24: Write a Java program to check voting eligibility.

Accept age. If the age is below 18, throw an exception.
Asked In Practice Assignment
Input:
Enter age: 16

Output:
Not eligible for voting

Explanation:
Voting eligibility requires age validation based on legal requirements. When age (16) 
is below legal voting age (18), exception is thrown with clear message. This demonstrates 
business rule validation using exceptions. Age validation prevents unauthorized voting and
 ensures compliance with voting laws.*/
 import java.util.*;
 class VotingException extends Exception
 {
	 VotingException(String msg)
	 {
		 super(msg);
	 }
 }
 class Q24VotingException
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Age");
		 int age=xyz.nextInt();
		 try
		 {
			 if(age<18)
			 {
				 throw new VotingException("Not eligible for voting") ;
			 }
			 else
			 {
				 System.out.println("eligible for voting");
			 }
		 }
		 catch(VotingException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
 }