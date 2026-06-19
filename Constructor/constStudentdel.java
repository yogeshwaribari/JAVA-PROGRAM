/*Question 16: Write a Java program to delete a student record from an array using constructor objects.

Description: Create Student class with rollNo, name and percentage. Store student objects. Accept 
roll number to delete and remove that record (shift array).
INPUT:
Students:
1 Ravi 70
2 Kiran 65
3 Om 80

Enter roll to delete: 2

OUTPUT:
Remaining Student:
1 Ravi 70
3 Om 80

EXPLANATION:
Create Student class with rollNo, name, percentage. Store students in array using constructor.
 Accept roll number to delete. Find matching student in array. Shift remaining elements forward 
 (remove element). Display remaining students without deleted record.*/
 import java.util.*;
 class Student 
 {
	 int rollNo;
	 String name;
	 int percentage;
	 
	 Student(int rollNo,String name,int percentage)
	 {
		 this.rollNo=rollNo;
		 this.name=name;
		 this.percentage=percentage;
	 }
	 void display()
	 {
		 
		 System.out.println(rollNo+ " "+name+ " "+percentage);
	 }
 }
 class constStudentdel
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 Student s[]=new Student[3];
		 for(int i=0;i<s.length;i++)
		 {
			 System.out.println("Enter Roll No :");
			 int rollNo=xyz.nextInt();
			 xyz.nextLine();
			 System.out.println("Enter Name");
			 String name=xyz.nextLine();
			 System.out.println("Enter Percentage");
			 int percentage=xyz.nextInt();
			 
			 s[i]=new Student(rollNo,name,percentage);
		 }
		 System.out.println("Enter Roll no delete");
		 int droll=xyz.nextInt();
		 int idx=0;
		 System.out.println("Remaining Students :");
		 for(int i=0;i<s.length;i++)
		 {
			 if(s[i].rollNo!=droll)
			 {
				 s[idx]=s[i];
				 s[idx].display();
				 idx++;
			 }
		 }
	 }
 }