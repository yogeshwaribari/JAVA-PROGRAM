/*Multiply array*/
import java.util.Scanner;
class MultiplyMatrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter matrix 1");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		System.out.println("Enter matrix 2");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				int sum=0;
				for(int k=0;k<a[i].length;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
				c[i][j]=sum;
			}
		}
		System.out.println("Multiply matrix");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}