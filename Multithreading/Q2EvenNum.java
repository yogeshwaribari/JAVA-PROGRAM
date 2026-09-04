/*Question 2: Write a Java program to create a thread using Runnable interface and display 
even numbers.

Create a class that implements Runnable interface. Print even numbers between given ranges 
using run() method.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Even numbers are:
2 4 6 8 10

Explanation:
Runnable interface is preferred way to create threads as it avoids single inheritance limitation. 
Implement Runnable, override run() method, and pass instance to Thread constructor. This allows
 class to extend other classes while implementing Runnable. Provides better design and flexibility 
 compared to extending Thread class directly.*/
 import java.util.*;
 class EvenNum implements Runnable
 {
	 int limit;
	 EvenNum(int limit)
	 {
		 this.limit=limit;
	 }
	 public void run()
	 {
		 System.out.println("Even numbers are: ");
		 for(int i=1;i<=limit;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.print(i+" ");
			 }
		 }
	 }
 }
 class Q2EvenNum
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Limit");
		 int limit=xyz.nextInt();
		 
		 EvenNum e=new EvenNum(limit);
		 Thread t=new Thread(e);
		 t.start();
	 }
 }