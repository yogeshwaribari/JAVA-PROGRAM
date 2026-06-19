/*Question 25: Write a Java program to find youngest person.

Description: Create Person class with name and age. Find minimum age person.
Asked In: Practice Assignment
Run
Clear
INPUT:
Ram 25
Shyam 20
Mohan 30

OUTPUT:
Youngest Person: Shyam
Age: 20

EXPLANATION:
Create Person class with fields name and age. Use constructor to initialize. Store 3 persons
 in array. Initialize minAge = persons[0].age and minPerson = persons[0]. Loop through array, 
 if current age < minAge, update minAge and minPerson. Display youngest person name and age. 
 Shyam with age 20 is minimum.*/
 import java.util.*;
 class Person
 {
	 String name;
	 int age;
	 
	 Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 void display(int min)
	 {
		System.out.println("Youngest Person:"+name);
		System.out.println("Age:"+min);
	 }
 }
 class PersonAge{
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 Person p[]=new Person[3];
		 for(int i=0;i<p.length;i++)
		 {
			 System.out.println("Enter Name");
			 String name=xyz.next();
			 System.out.println("Enter Age");
			 int age=xyz.nextInt();
			 
			 p[i]=new Person(name,age);
		 }
		 int min=p[0].age;
		 int ind=0;
		for(int i=0;i<p.length;i++)
		{
			if(min>p[i].age)
			{
				min=p[i].age;
				ind=i;
			}
		}
		p[ind].display(min);
	 }
 }