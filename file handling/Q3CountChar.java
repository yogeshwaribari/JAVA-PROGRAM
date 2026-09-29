/*Question 3: Write a Java program to count total characters in a file.
Asked In Practice Assignment
Input:
File content:
Java Programming

Output:
Total characters = 17

Explanation:
Open file using FileReader to read character by character. 
Initialize counter to zero. Use read() method in loop to read each character including spaces.
 Increment counter for every character read. When read() returns -1, file end is reached. Count 
 includes all characters: letters, digits, spaces, and special characters. Display final count.*/
 import java.io.*;
 class Q3CountChar
 {
	 public static void main(String x[]) throws IOException
	 {
		 File f=new File("student.txt");
		 FileReader fr=new FileReader(f);
		  int cnt=0;
		 while(fr.read()!=-1)
		 {
			cnt++;
		 }
		 //f.close();
		 fr.close();
		 System.out.println("Total characters :"+cnt);
	 }
 }