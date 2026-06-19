/*Question 30: Write a Java program to implement a Product Discount Calculator using POJO class.
Create a POJO class Product with variables productId, price, and quantity.
Using getter and setter methods:
- Calculate total amount = price * quantity
- If total > 5000 => 10% discount
- Otherwise => No discount
Display final amount.
Input:
Enter Product Id : 101
Enter Price : 1200
Enter Quantity : 5

Output:
Product Id : 101
Total Amount : 6000
Discount : 600
Final Amount : 5400

Explanation:
A POJO class Product has private fields: productId, price, quantity.
Total Amount = price * quantity = 1200 * 5 = 6000.
Condition: if (totalAmount > 5000) => 10% discount.
Discount = 6000 * 10 / 100 = 600.
Final Amount = 6000 - 600 = 5400.
Setters store values entered by user. Getters retrieve them for calculation.
This demonstrates POJO encapsulation combined with business discount logic.*/
import java.util.*;
class Product{
	private int productId;
	private int price;
	private int quantity;
	
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public int getProductId()
	{
		return productId;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Product Id");
		setProductId(xyz.nextInt());
		System.out.println("Enter Price");
		setPrice(xyz.nextInt());
		System.out.println("Enter Quantity");
		setQuantity(xyz.nextInt());
	}
	void DiscountData()
	{
		System.out.println("Product Id : "+getProductId());
		int amt=getPrice()*getQuantity();
		System.out.println("Total Amount : "+amt);
		
		if(amt>5000)
		{
			int dis=(amt*10)/100;
			System.out.println("Discount :"+dis);
			int famt=amt-dis;
			System.out.println("Final Amount : "+famt);
		}
		else
		{
			System.out.println("No Discount");
			System.out.println("Final Amount :"+amt);
		}
	}
}
class Q30POJOProduct
{
	public static void main(String x[])
	{
		Product p=new Product();
		p.putData();
		p.DiscountData();
	}
}