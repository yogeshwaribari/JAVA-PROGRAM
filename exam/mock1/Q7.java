/*
Q7. Mobile plan billing system:
• Input: Minutes used in a month
• Logic:
o Up to 100 mins → Base ₹199
o 101–300 mins → ₹199 + ₹1/min for extra
o 301–500 mins → ₹199 + ₹1.5/min for extra
o Above 500 mins → ₹199 + ₹2/min for extra
• Output: Total monthly bill
*/
import java.util.Scanner;
class Q7
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Minutes");
		int min = xyz.nextInt();
		int base = 199;
		double extra =0;
		
		if(min<=100)
		{
			System.out.println("No extra Charge");
		}
		else if(min>100 && min<=300)
		{
			min = min-100;
			extra=min*1; //1 extra charge
			
		}
		else if(min>300 && min<=500)
		{
			min = min-100;
			extra=min*1.5; //1.5 extra charge
		}
		else{
			min = min-100;
			extra=min*2; // 2 extra charge
		}
		System.out.println("Total Bill = "+(base+extra));
	}
}