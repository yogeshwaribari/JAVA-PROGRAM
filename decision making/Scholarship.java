/*
Question 39: Check whether a student is eligible for scholarship:

   Attendance >= 75% and marks >= 80**
   Input: Attendance %, marks
   Logic: if-else
   Output: Eligible or not.
Input:
Attendance = 80%
Marks = 85

Output:
Eligible for Scholarship

Explanation:
Eligibility conditions:
Attendance ? 75% AND Marks ? 80
If both conditions true ? Eligible
Else ? Not Eligible
*/
import java.util.Scanner;
class Scholarship
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Attendance");
		int a = xyz.nextInt();
		System.out.println("Enter Marks");
		int m = xyz.nextInt();
		if(a>75 && m>80)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}