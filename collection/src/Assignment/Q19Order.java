/*Q19.Create Order class:
● orderId
● customerName
● amount
Store orders in Vector and find highest order amount.
Description
Logic:
if(amount > max)
max = amount;
Input
1 Ram 2500
2 Sita 4200
3 Mohan 3100
Output
Highest Order Amount = 4200*/
package Assignment;
import java.util.*;
class Order{
	private int orderId;
	private String customerName;
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	private int amount;
	
	Order(int orderId,String customerName,int amount)
	{
		this.orderId=orderId;
		this.customerName=customerName;
		this.amount=amount;
	}
}
public class Q19Order {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of order");
		int n=xyz.nextInt();
		Vector <Order> v=new Vector<Order>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Id");
			int orderId=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter Name");
			String name=xyz.nextLine();
			System.out.println("Enter amount");
			int amount=xyz.nextInt();
			Order o=new Order(orderId,name,amount);
			v.add(o);
		}
		int max=0;
		for(Order o1:v)
		{
			if(o1.getAmount()>max)
			{
				max=o1.getAmount();
			}
		}
		System.out.println("Highest Order Amount = "+max);

	}

}
