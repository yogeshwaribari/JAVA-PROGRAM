/*Question 14: Write a Java program to implement an Online Order Billing System.
Create a class Order with attributes orderId, productPrice, and quantity.
Calculate:
- Total amount = productPrice * quantity
- If total > 5000 => 15% discount
- Otherwise => No discount
Display final amount after discount.
Input:
Enter Order Id : 1001
Enter Product Price : 1200
Enter Quantity : 5

Output:
Order Id : 1001
Total Amount : 6000
Discount : 900
Final Amount : 5100

Explanation:
A class Order is created with orderId, productPrice, and quantity.
Total Amount = productPrice * quantity = 1200 * 5 = 6000.
Since Total Amount (6000) > 5000, a 15% discount is applied:
Discount = 6000 * 15 / 100 = 900
Final Amount = 6000 - 900 = 5100.
If total were 4000 (< 5000), no discount would be applied.
This program demonstrates multiplication, conditional discount, and subtraction using class objects.
*/
import java.util.*;
class Order{
	int orderId;
	int productPrice;
	int quantity;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Order ID");
		orderId=xyz.nextInt();
		System.out.println("Enter product Price");
		productPrice=xyz.nextInt();
		System.out.println("Enter quantity");
		quantity=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Product ID : "+orderId);
		int totalamt=productPrice*quantity;
		System.out.println("Total Amount : "+totalamt);
		int discount=0;
		if(totalamt>5000)
		{
			discount=(totalamt*15)/100;
			System.out.println("Discount : "+discount);
		}
		else
		{
			System.out.println("No Discount");
		}
		int finalamt=totalamt-discount;
		System.out.println("Final Amount : "+finalamt);
	}
	public static void main(String x[])
	{
		Order o=new Order();
		o.putData();
		o.getData();
	}
}