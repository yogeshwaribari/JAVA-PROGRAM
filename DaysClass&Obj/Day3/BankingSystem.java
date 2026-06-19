/*21. In a Banking System, how would you use constructor overloading to create different types
 of accounts?*/
 import java.util.*;
 class Banking
 {
	 int accNo;
	 String name;
	 double amt;
	 
	 Banking()
	 {
		 System.out.println("Default constructor");
	 }
	 
	 Banking(int accNo)
	 {
		 this.accNo=accNo;
	 }
	 Banking(int accNo,String name)
	 {
		 this.accNo=accNo;
		 this.name=name;
	 }
	 Banking(int accNo,String name,double amt)
	 {
		 this.accNo=accNo;
		 this.name=name;
		 this.amt=amt;
	 }
	 
	 void display()
	 {
		 System.out.println(accNo+" "+name+ " "+amt);
	 }
 
 }
 class BankingSystem
 {
	 public static void main(String x[])
	 {
		 Banking b1=new Banking();
		 Banking b2=new Banking(101);
		 Banking b3=new Banking(101,"Ram");
		 Banking b4=new Banking(101,"Ram",5000);
		 
		 b2.display();
		 b3.display();
		 b4.display();
	 }
 }