/*5. Smart Home Automation System
A company develops a smart home application.
Requirements:
•	Create an abstract class SmartDevice. 
•	Create child classes SmartLight, SmartFan, and SmartAC. 
•	Every device performs its own operation. 
•	Every device supports Wi-Fi connectivity. 
•	Device serial number cannot be modified. 
•	Initialize device details using the parent constructor. 
•	Control devices through a common SmartDevice reference
•	The manufacturer's security policy method must not be overridden. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Method Overriding 
•	Dynamic Polymorphism 
•	super() Constructor 
•	final Method 
•	Loose Coupling 
*/
import java.util.*;
interface Wificonnect
{
	public void wifiConnection();
}
abstract class SmartDevice implements Wificonnect
{
	final int serialNo;
	String deviceName;
	SmartDevice(int serialNo,String deviceName)
	{
		this.serialNo=serialNo;
		this.deviceName=deviceName;
	}
	abstract void operation();
	void display()
	{
		System.out.println("Serial No :"+serialNo);
		System.out.println("Device Name :"+deviceName);
	}
	final void security()
	{
		System.out.println("Manufacturer Security Policy Applied");
	}
}
class SmartLight extends SmartDevice
{
	SmartLight(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	 void operation()
	{
		System.out.println("Smart Light is ON");
	}
	public void wifiConnection()
	{
		System.out.println("Connected to Wi-Fi");
	}
}
class SmartFan extends SmartDevice
{
	SmartFan(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	 void operation()
	{
		System.out.println("Smart Fan is Running");
	}
	public void wifiConnection()
	{
		System.out.println("Connected to Wi-Fi");
	}
}
class SmartAC extends SmartDevice
{
	
	SmartAC(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	 void operation()
	{
		System.out.println("Smart AC Cooling Started");
	}
	public void wifiConnection()
	{
		System.out.println("Connected to Wi-Fi");
	}
}
class SmartHomeSystem
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Serial Number");
		int serialNo=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Device Name");
		String deviceName=xyz.nextLine();
		
		SmartDevice s;
		
		System.out.println("1.Smart Light");
		System.out.println("2.Smart Fan");
		System.out.println("3.Smart AC");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
			case 1:
			s=new SmartLight(serialNo,deviceName);
			s.display();
			s.wifiConnection();
			s.operation();
			s.security();
			break;
			
			case 2:
			s=new SmartFan(serialNo,deviceName);
			s.display();
			s.wifiConnection();
			s.operation();
			s.security();
			break;
			
			case 3:
			s=new SmartAC(serialNo,deviceName);
			s.display();
			s.wifiConnection();
			s.operation();
			s.security();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}