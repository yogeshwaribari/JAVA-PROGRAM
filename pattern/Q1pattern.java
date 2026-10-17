/*Q1. Write a java program to print this pattern.   
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * *   */
 
 import java.util.*;
 class Q1pattern
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter size for pattern");
		 int n=xyz.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 
			 for(int j=1;j<=n;j++)
			 {
				 System.out.print(" *");
			 }
			 
			 
			 System.out.println();
		 }
	 }
 }