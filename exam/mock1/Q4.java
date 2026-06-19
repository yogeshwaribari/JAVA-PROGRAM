/*
Q4.Take a three-digit number and print whether the middle digit is greater than the sum of the
first and last digits using the conditional & ternary operator.
Example:
• Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater
• Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater
*/
import java.util.Scanner;
class Q4
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int f = no/100;//5
		int m = (no%100)/10;//7
		int l = no%10;//2
		int sum = f+l;//5+2=7
		String msg = ((m==sum) ? "Equal" : (m<sum) ? "Not greater" : "greater");
		System.out.println(msg);
	}


}