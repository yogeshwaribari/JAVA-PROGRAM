/*
Question 29: Write a java program to input electricity unit charges & calculate total electricity bill 
according to the given condition
                For first 50 units Rs. 0.50/unit
                For next 100 units Rs. 0.75/unit
                For next 150 units Rs. 1.20/unit
                For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units ? 50 × 0.50
Next 100 units ? 100 × 0.75
Next 150 units ? 150 × 1.20
Remaining units ? 50 × 1.50
Total amount is calculated and then 20% surcharge is added.
*/
import java.util.Scanner;

class ElectricityBill {
    public static void main(String x[]) {

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Units");
        double u = xyz.nextDouble();

        double bill = 0;

        if (u <= 50) {
            bill = u * 0.50;
        }
        else if (u <= 150) {
            bill = (50 * 0.50) + ((u - 50) * 0.75);
        }
        else if (u <= 300) {
            bill = (50 * 0.50) 
                 + (100 * 0.75) 
                 + ((u - 150) * 1.20);
        }
        else {
            bill = (50 * 0.50) 
                 + (100 * 0.75) 
                 + (150 * 1.20) 
                 + ((u - 300) * 1.50);
        }

        // 20% surcharge
        bill = bill + (bill * 0.20);

        System.out.println("Total Electricity Bill = " + bill);
    }
}
	