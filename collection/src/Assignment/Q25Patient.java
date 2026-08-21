/*Q25.Problem Statement 
Develop a patient management system using Vector and POJO class Patient.
Fields
● int patientId
● String name
● int age
● String disease
Operations
1. Add patients
2. Display patients
3. Find oldest patient
4. Search by disease
5. Count patients above age 50
Input
3 patients
101 Ravi 65 Diabetes
102 Anil 45 Fever
103 Sunil 72 BP
Disease search:
BP
Output
Patient List:
101 Ravi 65 Diabetes
102 Anil 45 Fever
103 Sunil 72 BP
Oldest Patient:
Sunil
BP Patients:
Sunil
Patients above 50:
2*/
package Assignment;
import java.util.*;
class Patient
{
	private int patientId;
	private String name;
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	private int age;
	private String disease;
	
	Patient(int patientId,String name,int age,String disease){
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.disease=disease;
	}
}
public class Q25Patient {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of patient");
		int n=xyz.nextInt();
		Vector <Patient> v=new Vector<>();
		do
		{
			System.out.println("1. Add patients");
			System.out.println("2. Display patients");
			System.out.println("3. Find oldest patient");
			System.out.println("4. Search by disease");
			System.out.println("5. Count patients above age 50");
			System.out.println("Enter your choice");
			int c=xyz.nextInt();
			
			switch(c)
			{
			case 1:
				System.out.println("Enter Patient Id");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Patient Name");
				String name=xyz.nextLine();
				System.out.println("Enter Patient Age");
				int age=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Patient disease");
				String disease=xyz.nextLine();
				Patient p=new Patient(id,name,age,disease);
				v.add(p);
				System.out.println("Added Successful");
				break;
				
			case 2:
				if(v.size()!=0)
				{
					for(Patient p1:v)
					{
						System.out.println(p1.getPatientId()+"\t"+p1.getName()+"\t"+p1.getAge()+"\t"+p1.getDisease());
					}
				}
				else
				{
					System.out.println("Patient data not present in collection");
				}
				break;
				
			case 3:
				int max=0;
				String oname="";
				for(Patient p2:v)
				{
					if(p2.getAge()>max)
					{
						max=p2.getAge();
						oname=p2.getName();
					}
					
				}
				System.out.println("Oldest Patient : "+oname);
				break;
				
			case 4:
				xyz.nextLine();
				System.out.println("Enter Search by disease");
				String sname=xyz.nextLine();
				System.out.println(sname+" Disease");
				for(Patient p3:v)
				{
					if(p3.getDisease().equals(sname))
					{
						System.out.println(p3.getName());
					}
				}
				break;
				
			case 5:
				int cnt=0;
				for(Patient p4:v)
				{
					if(p4.getAge()>50)
					{
						cnt++;
					}
				}
				System.out.println("Patients above 50 : "+cnt);
				break;
				
				default:
					System.out.println("Wrong choice");
			}
		}while(true);
		

	}

}
