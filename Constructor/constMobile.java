/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile 
class and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. Create overloaded constructors 
(one without discount, one with discount). If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000

EXPLANATION:
Create two constructors: public Mobile(int id, String name, int p) and public Mobile
(int id, String name, int p, boolean discount). First constructor stores original price. 
Second constructor calculates 10% discount: price = price - (price * 10 / 100). 
Display both original and discounted price.*/
import java.util.*;
class Mobile{
	int mobileId;
	String mobileName;
	int price;
	int discount;
	
	
	Mobile(int id,String name,int p)
	{
		this.mobileId=id;
		this.mobileName=name;
		this.price=p;
	}
	Mobile(int id,String name,int p,int discount)
	{
		this.mobileId=id;
		this.mobileName=name;
		this.price=p;
		//this.discount=price-(price*10/100);
		this.discount=discount;
	}
	void discount()
	{
		discount=price-(price*10/100);
		
	}
	void display()
	{
		System.out.println("Original Price:"+price);
		System.out.println("Discount Price:"+discount);
	}
}
class constMobile
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Mobile Id");
		int mobileId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Mobile Name");
		String mobileName=xyz.nextLine();
		System.out.println("Enter price");
		int price=xyz.nextInt();
		
		Mobile m=new Mobile(mobileId,mobileName,price);
		m.discount();
		m.display();
		
	}
}