/*Question 34: Create a base class Shop with attribute shopName.
Create a child class Item that adds price.
Create another child class DiscountItem that adds discount.
Use this keyword and constructor chaining.
Store 3 items using array and calculate final price.
Asked In Practice Assignment
Description
Demonstrates price calculation using this keyword.
Input
Enter number of Items: 3

Enter Shop: D-Mart
Enter Price: 100
Enter Discount: 10

Enter Shop: Reliance
Enter Price: 200
Enter Discount: 20

Enter Shop: BigBazaar
Enter Price: 300
Enter Discount: 30
Output
Shop: D-Mart, Final Price: 90
Shop: Reliance, Final Price: 180
Shop: BigBazaar, Final Price: 270*/
import java.util.*;
class Shop{
	String shopName;
	Shop(String shopName)
	{
		this.shopName=shopName;
	}
}
class Item extends Shop
{
	int price;
	Item(String shopName,int price)
	{
		super(shopName);
		this.price=price;
	}
}
class DiscountItem extends Item
{
	int discount;
	DiscountItem(String shopName,int price,int discount)
	{
		super(shopName,price);
		this.discount=discount;
	}
	void display()
	{
		System.out.println("Shop :"+shopName+", Final Price :"+(price-discount));
	}
}
class Q34Shop
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Items");
		int n=xyz.nextInt();
		
		DiscountItem d[]=new DiscountItem[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Shop name");
			String shopName=xyz.nextLine();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter Discount");
			int discount=xyz.nextInt();
			d[i]=new DiscountItem(shopName,price,discount);
		}
		for(int i=0;i<n;i++)
		{
			d[i].display();
		}
	}
}