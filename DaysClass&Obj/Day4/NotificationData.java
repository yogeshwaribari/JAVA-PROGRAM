/*2. Notification System
Scenario: An application sends notifications through Email, SMS, and Push Notifications. 
The process of sending notifications differs for each channel.
Question: How would you implement sendNotification() using polymorphism?*/
class Notification
{
	void sendNotification()
	{
		System.out.println("Sending Notification");
	}
}
class Email extends Notification
{
	void sendNotification()
	{
		System.out.println("Sending Email Notification");
	}
}
class SMS extends Notification
{
	void sendNotification()
	{
		System.out.println("Sending SMS Notification");
	}
}
class Push extends Notification
{
	void sendNotification()
	{
		System.out.println("Sending Push Notification");
	}
}
class NotificationData
{
	public static void main(String x[])
	{
		Notification n1=new Email();
		Notification n2=new SMS();
		Notification n3=new Push();
		
		n1.sendNotification();
		n2.sendNotification();
		n3.sendNotification();
	}
}