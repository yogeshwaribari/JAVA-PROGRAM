/*6. Take a number and reverse it. Check whether it is a palindrome. If it is a palindrome,
 additionally check whether it is divisible by 3 and 5.*/
 import java.util.*;
 class Q6Reversepalindro
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter number");
		 int n =xyz.nextInt();
		 int temp=n;
		 int rev=0;
		 while(n!=0)
		 {
			 int d=n%10;
			 rev=rev*10+d;
			 n=n/10;
		 }
		 System.out.println("Reverse number ="+rev);
		 if(rev==temp)
		 {
			 System.out.println("Palindrome number");
			  if(rev%3==0 && rev%5==0)
		 {
			 System.out.println("Number is Divisible by 3 and 5");
		 }
		 else{
			 System.out.println("Number is Not Divisible by 3 and 5");
		 }
		 }
		 else
		 {
			 System.out.println("Not Palindrome number");
		 }
		
	 }
 }