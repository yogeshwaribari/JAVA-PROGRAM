/*Question 22: Write a Java program to validate employee salary.

Accept employee salary. If the salary is below minimum wage (10000), throw an exception.
Asked In Practice Assignment
Input:
Enter salary: 8000

Output:
Salary below minimum limit

Explanation:
Salary validation ensures compliance with minimum wage requirements. When salary (8000) 
is less than minimum (10000), exception is thrown with descriptive message. This business
 rule validation uses exceptions to enforce constraints. Implementing salary validation prevents
 processing of illegal wage amounts and maintains data integrity.*/
 import java.util.*;
 class ValidateEmp extends Exception
 {
	 ValidateEmp(String msg)
	 {
		 super(msg);
	 }
 }
 class Q22ValidateEmp
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Salary");
		 int sal=xyz.nextInt();
		 try
		 {
			 if(sal<=10000)
			 {
				 throw new ValidateEmp("Salary below minimum limit");
			 }
			 else
			 {
				 System.out.println("Salary :"+sal);
			 }
		 }
		 catch(ValidateEmp e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
 }
 