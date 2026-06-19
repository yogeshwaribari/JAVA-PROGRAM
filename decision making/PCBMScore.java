/*
Question 27: Write a java program to input marks of five subjects Physics, Chemistry, Biology,
       Mathematics and Computer, calculate percentage and grade according to given conditions:
                    percentage >= 90% : Grade A
                    percentage >= 80% : Grade B
                    percentage >= 70% : Grade C
                    percentage >= 60% : Grade D
                    percentage >= 40% : Grade E
                    percentage < 40% : Grade F
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80%
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400
Percentage = 400 / 5 = 80%
Since percentage is 80%, Grade B is assigned.
*/
import java.util.Scanner;
class PCBMScore
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Five Subject Marks");
		int p,c,b,m,com;
		p = xyz.nextInt();
		c = xyz.nextInt();
		b = xyz.nextInt();
		m = xyz.nextInt();
		com = xyz.nextInt();
		System.out.println("Physics = " +p+ "\nChemistry =" +c+ "\nBiology =" +b+ "\nMathematics =" +m+ "\nComputer =" +com);
		int Total = p+c+b+m+com;
		int per = Total /5;
		System.out.println("Percentage =" +per+ "%");
		if(per>=100 && per>=90)
		{
			System.out.println("Grade = A");
		}
		else if(per>=80)
		{
			System.out.println("Grade = B");
		}
		else if(per>=70)
		{
			System.out.println("Grade = C");
		}
		else if(per>=60)
		{
			System.out.println("Grade = D");
		}
		else if(per>=40)
		{
			System.out.println("Grade = E");
		}
		else{
			System.out.println("Grade = F");
		}
		
		
	}
}