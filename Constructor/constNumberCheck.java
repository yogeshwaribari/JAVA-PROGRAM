/*Question 7: Write a Java program to check whether a number is even or odd using 
constructor initialization.

Description: Create NumberCheck class with one integer variable. Initialize using constructor and 
check even or odd using logical condition.
INPUT:
Enter Number: 17

OUTPUT:
17 is Odd Number

EXPLANATION:
Create NumberCheck class with int number field. Use constructor public NumberCheck(int num) to initialize.
 Check if number % 2 == 0 then "Even" else "Odd". Display number and type. Create object new NumberCheck
 (17) and display result.*/
 import java.util.*;
 class NumberCheck
 {
	 private int num;
	 
	 NumberCheck(int num)
	 {
		 this.num=num;
	 }
	 void display()
	 {
		 if(num%2==0)
		 {
			 System.out.println(num+" is Even Number");
		 }
		 else
		 {
			 System.out.println(num+" is Odd Number");
		 }
	 }
	 
 }
 class constNumberCheck
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 
		 System.out.println("Enter number");
		 int num = xyz.nextInt();
		 NumberCheck n=new NumberCheck(num);
		 n.display();
	 }
	 
 }