package collection;
import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int sal;
	
	Employee()
	{
		
	}
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	
	
}

public class EmployeeData {
	
	public static void main(String x[])
	{
		Vector v=new Vector();
		Employee e=new Employee();
		e.setId(1);
		e.setName("ABC");
		e.setSal(10000);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("MNO");
		e1.setSal(20000);
		v.add(e);
		v.add(e1);
		System.out.println("Display Employee Data");
		for(Object obj:v)
		{
			Employee e2=(Employee)obj;
			System.out.println(e2.getId()+"\t"+e2.getName()+"\t"+e2.getSal());
		}
				
		
	}

}
