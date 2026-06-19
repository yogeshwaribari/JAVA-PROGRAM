/*Question 14: Write a Java program to create a Customer class and search a customer by id.

Description: Create Customer POJO class with id, name and city. Store multiple customers using 
constructor. Accept id from user and search customer.
INPUT:
Enter Customers:
1 Raj Pune
2 Amit Mumbai
3 Neha Nashik

Enter search Id: 2

OUTPUT:
Customer Found
Name: Amit
City: Mumbai

EXPLANATION:
Create Customer class with fields id, name, city. Use constructor to initialize. 
Create Customer[] array and store 3 customers. Accept search id from user. Loop through array,
 if id matches print "Customer Found" with name and city else print "Not Found".*/
 import java.util.*;
 class Customer
 {
	 int id;
	 String name;
	 String city;
	
	Customer(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	void display()
	{	
		System.out.println("Name: "+name);
		System.out.println("City : "+city);
	}
 }
 class constCustomer
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);

		 Customer c[]=new Customer[3];
		 for(int i=0;i<c.length;i++)
		 {
			 System.out.println("Enter Id");
			 int id=xyz.nextInt();
			 xyz.nextLine();
			 System.out.println("Enter Name");
			 String name = xyz.nextLine();
			 System.out.println("Enter City");
			 String city=xyz.nextLine();
			 
			 c[i]=new Customer(id,name,city);
		 }
		 System.out.println("Enter search Id:");
		 int skey=xyz.nextInt();
		 boolean flag=false;
		 for(int i=0;i<c.length;i++)
		 {
			 if(c[i].id==skey)
			 {
				 System.out.println("Customer Found");
				 c[i].display();
				 flag=true;
				 break;
			 }
		 }
		 if(!flag)
			 {
				  System.out.println("Not Found");
			 }
		 
		
	 }
	 
 }