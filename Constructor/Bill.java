/*Question 24: Write a Java program to calculate total price of 5 items.

Description: Create Item class with itemName and price. Store using constructor. Calculate total bill.
INPUT:
Pen 10
Book 50
Bag 500
Bottle 200
Scale 20

OUTPUT:
Total Bill Amount: 780

EXPLANATION:
Create Item class with fields itemName and price. Use constructor to initialize. 
Store 5 items in array. Loop through array and sum all prices: 10+50+500+200+20 = 780.
 Display total bill amount.*/
 import java.util.*;
 class Item
 {
	 String name;
	 int price;
	 
	 Item(String name,int price)
	 {
		 this.name=name;
		 this.price=price;
	 }
	 
	
 }
 class Bill
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 Item b[]=new Item[5];
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println("Enter Item name");
			 String name=xyz.next();
			 System.out.println("Enter Price");
			 int price=xyz.nextInt();
			 b[i]=new Item(name,price);
		 }
		 int total=0;
		 for(int i=0;i<b.length;i++)
		 {
			 total=total+b[i].price;
			
		 }
		System.out.println("Total Bill Amount:"+total);
	 }
 }