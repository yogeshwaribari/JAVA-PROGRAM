/*Question 51: Create abstract class Product.

Abstract method applyDiscount().
Subclasses:

Electronics

Clothing

Apply different discounts.

Input
Type: Electronics
Price: 10000
Discount: 10%
Output
Final Price: 9000*/
import java.util.*;
abstract class Product
{
	abstract void applyDiscount();
}
class Electronics extends Product
{
	int price;
	int discount;
	Electronics(int price,int discount)
	{
		this.price=price;
		this.discount=discount;
	}
	void applyDiscount()
	{
		int finalpri=price*discount/100;
		System.out.println("Final Price :"+(price-finalpri));
	}
}
class Clothing extends Product
{
	int price;
	int discount;
	Clothing(int price,int discount)
	{
		this.price=price;
		this.discount=discount;
	}
	void applyDiscount()
	{
			int finalpri=price*discount/100;
		System.out.println("Final Price :"+(price-finalpri));
	}
}
class Q51Product
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		Product p;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter Discount");
			int discount=xyz.nextInt();
			p=new Electronics(price,discount);
			p.applyDiscount();
			break;
			
			case 2:
			System.out.println("Enter Price");
			 price=xyz.nextInt();
			System.out.println("Enter Discount");
			 discount=xyz.nextInt();
			p=new Clothing(price,discount);
			p.applyDiscount();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}
