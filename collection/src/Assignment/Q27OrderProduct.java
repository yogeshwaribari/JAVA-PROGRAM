/*Q27. Create a Java application to manage customer orders using Vector and POJO class Order. The system must perform logical operations related to customer purchase records.
Description
Order class fields:
● int orderId
● String customerName
● String productName
● double amount
Operations
1. Add orders
2. Display all orders
3. Find highest order amount
4. Search orders by customer name
5. Calculate total sales amount
Input
Enter orders:
3
101 Amit Laptop 55000
102 Neha Mobile 20000
103 Rahul Tablet 15000
Search customer:
Neha
Output
Order List:
101 Amit Laptop 55000
102 Neha Mobile 20000
103 Rahul Tablet 15000
Highest Order:
Amit 55000
Neha Orders:
Mobile
Total Sales:
90000*/
package Assignment;
import java.util.*;
class Order
{
	private  int Id;
	private String custName;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	private String proName;
	private double amt;
	
	Order(int id,String custName,String proName,double amt)
	{
		this.Id=id;
		this.custName=custName;
		this.proName=proName;
		this.amt=amt;
	}
}

public class Q27OrderProduct {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of order");
		int n=xyz.nextInt();
		Vector<Order> v=new Vector<>();
		
		do {
			System.out.println("1. Add orders\r\n"
					+ "2. Display all orders\r\n"
					+ "3. Find highest order amount\r\n"
					+ "4. Search orders by customer name\r\n"
					+ "5. Calculate total sales amount");
			System.out.println("Enter your choice");
			int c=xyz.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter id");
				int id=xyz.nextInt();
				
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
				default:
					System.out.println("Wrong choice");
			}
		}while(true);

	}

}
