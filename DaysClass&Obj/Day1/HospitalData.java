/*Hospital Management System
In a hospital management application, you need to create an addPatient() method. 
Sometimes the receptionist enters only the patient's name and age, while in other cases they 
also enter address, phone number, and insurance details. How would you use method overloading 
to design the addPatient() functionality?
Scenario:
A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides *name, age, address, and phone number*.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, 
and insurance information, min advance amount.*/
import java.util.*;
class Hospital
{
	void addPatient(String name,int age,String address,String phoneNo)
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Phone No:"+phoneNo);
	}
	
	void addPatient(String name,int age,String address,String phoneNo,String insurance,int advance)
	{
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("Address :"+address);
		System.out.println("Phone No :"+phoneNo);
		System.out.println("Insurance :"+insurance);
		System.out.println("Advance :"+advance);
		
	}
}
class HospitalData
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Hospital h=new Hospital();
		System.out.println("Enter name");
		String name=xyz.nextLine();
		System.out.println("Enter Age");
		int age=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Address");
		String address=xyz.nextLine();
		//xyz.nextLine();
		System.out.println("Enter Phone No");
		String phoneNo=xyz.nextLine();
		
		
		xyz.nextLine();
		System.out.println("Enter name");
		String name2=xyz.nextLine();
		System.out.println("Enter Age");
		int age2=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Address");
		String address2=xyz.nextLine();
		//xyz.nextLine();
		System.out.println("Enter Phone No");
		String phoneNo2=xyz.nextLine();
		System.out.println("Enter Insurance");
		String insurance=xyz.nextLine();
		System.out.println("Enter advance");
		int advance=xyz.nextInt();
		
		h.addPatient(name,age,address,phoneNo);
		h.addPatient(name2,age2,address2,phoneNo2,insurance,advance);
	}
}
