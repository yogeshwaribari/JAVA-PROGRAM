/*Question 15: Create a base class Event with attributes eventName and registrationFee.
Create a child class Participant that adds numberOfParticipants.
Use super keyword to initialize parent properties.
Store 3 events using an array of objects and calculate total collection.
Asked In Practice Assignment
Description
This program demonstrates event management system using inheritance and array storage.
Input
Enter number of Events: 3

Enter Event Name: Coding
Enter Registration Fee: 100
Enter Participants: 10

Enter Event Name: Dance
Enter Registration Fee: 150
Enter Participants: 5

Enter Event Name: Quiz
Enter Registration Fee: 80
Enter Participants: 8
Output
Event: Coding, Total Collection: 1000
Event: Dance, Total Collection: 750
Event: Quiz, Total Collection: 640*/
import java.util.*;
class Event
{
	String eventName;
	int registrationFee;
	void setData(String eventName,int registrationFee)
	{
		this.eventName=eventName;
		this.registrationFee=registrationFee;
	}
}
class Participant extends Event
{
	int numberOfParticipants;
	void data(String eventName,int registrationFee,int numberOfParticipants)
	{
		super.setData(eventName,registrationFee);
		this.numberOfParticipants=numberOfParticipants;
	}
	void display()
	{
		System.out.println("Event :"+eventName+ ", Total Collection :"+(registrationFee*numberOfParticipants));
	}
}
class Q15Event
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Number of events");
		int n=xyz.nextInt();
		Participant p[]=new Participant[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Participant();
			System.out.println("Enter Event Name :");
			String eventName=xyz.next();
			System.out.println("Enter Registration fee");
			int registrationFee=xyz.nextInt();
			System.out.println("Enter Number of Participant");
			int numberOfParticipants=xyz.nextInt();
			p[i].data(eventName,registrationFee,numberOfParticipants);
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
	}
}
