/*Q17.Create Mobile class:
● id
● brand
● quantity
Store mobiles in Vector and display mobiles with stock less than 10.
Description
Condition:
quantity < 10
Input
1 Samsung 15
2 Vivo 8
3 Oppo 5
4 Apple 20
Output
Low Stock Mobiles:
2 Vivo 8
3 Oppo 5*/

package Assignment;
import java.util.*;
class Mobile
{
	private int id;
	private String brand;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	Mobile(int id,String brand,int quantity)
	{
		this.id=id;
		this.brand=brand;
		this.quantity=quantity;
	}
}
public class Q17Mobile {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of mobiles");
		int n=xyz.nextInt();
		ArrayList <Mobile> al=new ArrayList<Mobile>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter brand name");
			String brand=xyz.nextLine();
			System.out.println("Enter quantity");
			int quantity=xyz.nextInt();
			Mobile m=new Mobile(id,brand,quantity);
					al.add(m);
		}
		System.out.println("Low Stock Mobiles:");
		for(Mobile mob:al)
		{
			if(mob.getQuantity()<10)
			{
				System.out.println(mob.getId()+"\t"+mob.getBrand()+"\t"+mob.getQuantity());
			}
		}

	}

}
