/*
20. Find ASCII Value of Characters (No LeetCode)
Given a character or string, print the ASCII value corresponding to each character. 
Example: Input: "A" → Output: 65
*/
import java.util.*;
 class Day1Q20Ascii
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter your String");
		 String s=xyz.nextLine();
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 int ascii=ch;
			 System.out.println(ch+"-->"+ascii);
		 }
	 }
 }

