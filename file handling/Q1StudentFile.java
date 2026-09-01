/*Question 1: Write a Java program to create a file student.txt and store student name and 
marks into it.
Asked In Practice Assignment
Input:
Enter student name: Rahul
Enter marks: 78

Output:
File created successfully.
Data written successfully.

Explanation:
Create file using FileWriter class with filename student.txt. Accept student name and marks 
from user using Scanner. Write name and marks to file using write() method separated by space.
 Close FileWriter properly using close() method to save data. FileWriter automatically creates 
 new file if not exists and overwrites if already exists. Proper file closure ensures 
 no data loss.*/
 import java.io.*;
 import java.util.*;
 
 class Q1StudentFile
 {
	 public static void main(String x[]) throws IOException
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter Student name");
		 String name=xyz.nextLine();
		 
		 System.out.println("Enter Marks");
		 int marks=xyz.nextInt();
		 
		 FileWriter fw=new FileWriter("student.txt");
		 fw.write(name+" "+marks);
		 System.out.println("File created successfully.");
		 System.out.println("Data written successfully.");
		 
		 fw.close();
		 xyz.close();
	 }
 }
 