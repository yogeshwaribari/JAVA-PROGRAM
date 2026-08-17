/*Q16.Create Customer class:
● id
● name
● age
Store customers in Vector and display customers eligible for voting (age ≥18).
Description
Logical condition:
age >= 18
Input
1 Ravi 17
2 Meena 22
3 Arjun 19
4 Tina 15
Output
Eligible customers:
2 Meena 22
3 Arjun 19
*/

import java.util.*;
class Customer
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	Customer(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Q16VotingVector {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Customer");
		int n=xyz.nextInt();
		Vector <Customer>v=new Vector<Customer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();	
			System.out.println("Enter age");
			int age=xyz.nextInt();
			Customer c=new Customer(id,name,age);
			v.add(c);
		}
		System.out.println("Eligible customers:");
		for(Customer c:v)
		{
			if(c.getAge()>=18)
			{
				System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAge());
			}
		}

	}

}
