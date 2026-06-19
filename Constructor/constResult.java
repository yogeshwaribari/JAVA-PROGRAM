/*Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor. 
Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80

EXPLANATION:
Create Result class with fields mark1, mark2, mark3. Use constructor public 
Result(int m1, int m2, int m3) to initialize. Calculate average as (m1 + m2 + m3) / 3. 
Create method displayAverage() to print average. Create object new Result(70, 80, 90) and display average.
*/
import java.util.*;
class Result
{
	int mark1;
	int mark2;
	int mark3;
	
	Result(int m1,int m2,int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void display()
	{
		int avg=(mark1+mark2+mark3)/3;
		System.out.println("Average Marks:"+avg);
	}
}
class constResult
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter mark 1");
		int mark1=xyz.nextInt();
		System.out.println("Enter mark 2");
		int mark2=xyz.nextInt();
		System.out.println("Enter mark 3");
		int mark3=xyz.nextInt();
		Result r=new Result(mark1,mark2,mark3);
		r.display();
		
	}
}