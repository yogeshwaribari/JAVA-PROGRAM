/*Scenario 2: Hospital Management System
Business Requirement
A hospital wants to maintain patient records.
The receptionist should:
 Register patients.
 Search patients.
 Admit and discharge patients.
 Count total patients.
----------------
Class
Patient
------------------
Objects
 Ram
 Sita
 Mohan
Each patient is an object.
-------------------------
Instance Variables
patientId
name
age
disease
roomNo
Every patient has different values.
----------------------------------
Static Variables
hospitalName
totalPatients
These values are shared by all patients.
------------------------------------
Array of Objects
Patient [] patients = new Patient [500];
--------------------------------------
Example Data
Patient Id     Name         Disease
P101           Ram          Fever
P102           Sita         Diabetes
P103           Mohan        Covid
-------------------------------------
Test Cases
Test Case 1
Input: Register 3 patients.
Expected:totalPatients = 3
---------------------------------------
Test Case 2
Input: Discharge Patient P102.
Expected:
Patient removed successfully.
--------------------------------------
Test Case 3
Input: Update room number of Ram.
Expected:
Only Ram's room number changes.*/
import java.util.*;
class Patient
{
	String patientId;
	String name;
	int age;
	String disease;
	int roomNo;
	
	static String hospitalName="ABC Hospital";
	static int totalPatients=0;
	
	Patient(String patientId,String name,int age,String disease,int roomNo)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.disease=disease;
		this.roomNo=roomNo;
		totalPatients++;
	}
	
	void display()
	{
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Patient Id:"+patientId);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Disease:"+disease);
		System.out.println("Room No:"+roomNo);
	}
}
class HospitalSystem
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Patient p[]=new Patient[100];
		int choice;
		int cnt=0;
		do
		{
			System.out.println("1.Register patient");
			System.out.println("2.Discharge Patient");
			System.out.println("3.Update Room No");
			System.out.println("4.Total Patient");
			System.out.println("5.Display Patient");
			System.out.println("6.Exit");
			
			System.out.println("Enter your Choice");
			 choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.println("Enter Patient Id");
				String id=xyz.next();
				xyz.nextLine();
				System.out.println("Enter Name");
				String name=xyz.nextLine();
				System.out.println("Enter age");
				int age=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Disease");
				String disease=xyz.nextLine();
				System.out.println("Enter Room No");
				int roomNo=xyz.nextInt();
				
				p[cnt]=new Patient(id,name,age,disease,roomNo);
				cnt++;
				System.out.println("Patient Register");
				break;
				
				case 2:
				System.out.println("Enter Discharge Patient Id");
				xyz.nextLine();
				String did=xyz.nextLine();
				for(int i=0;i<cnt;i++)
				{
				if(p[i].patientId.equals(did))
				{
					p[i]=null;
					System.out.println("Discharge Patient Successful");
					  		Patient.totalPatients--;
				}
				}
				break;
				
				case 3:
				System.out.println("Enter patient name");
				xyz.nextLine();
				String pname=xyz.nextLine();
				
				for(int i=0;i<cnt;i++)
				{
					if(p[i].name.equals(pname))
					{
						System.out.println("Enter New Room No");
						int nroom=xyz.nextInt();
						p[i].roomNo=nroom;
						System.out.println("Room Updated");
					}
				}
				break;
				
				case 4:
				System.out.println("Total Patient :"+Patient.totalPatients);
				break;
				
				case 5:
				for(int i=0;i<cnt;i++)
				{
					p[i].display();
				}
				break;
				
				case 6:
				System.exit(0);
				break;
				
				default:
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}