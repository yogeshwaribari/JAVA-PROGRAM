/*Question 3: Write a Java program to create two threads where one prints numbers and another 
prints alphabets.

Create two separate threads. The first thread prints numbers from 1–5 and the second thread 
prints characters from A–E.
Asked In Practice Assignment
Input:
No input required

Output:
Numbers Thread: 1 2 3 4 5
Alphabet Thread: A B C D E

Explanation:
Multiple threads execute concurrently, allowing parallel execution of different tasks. 
Create separate Runnable implementations for each task and start multiple Thread objects.
 Both threads execute independently and may interleave their output due to scheduling. 
 Demonstrates concurrent execution of independent operations.*/
 import java.util.*;
 class NumberThread implements Runnable
 {
	 public void run()
	 {
		 System.out.println("Number Thread");
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(i+" ");
		 }
	 }
 }
 class Alphabet implements Runnable
 {
	 public void run()
	 {
		 System.out.println("Alphabet Thread");
		 for(char ch='A';ch<='E';ch++)
		 {
			 System.out.println(ch+" ");
		 }
	 }
 }
 class Q3TwoThread
 {
	 public static void main(String x[])
	 {
		 NumberThread n=new NumberThread();
		 Alphabet a=new Alphabet();
		 
		 Thread t1=new Thread(n);
		  t1.start();
		 Thread t2=new Thread(a);
		 
		
		 t2.start();
	 }
 }