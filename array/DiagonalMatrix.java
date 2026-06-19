/*Diagonal array*/
import java.util.Scanner;
class DiagonalMatrix{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int [3][3];
		System.out.println("Enter matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		int ldsum=0;
		int rdsum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					ldsum=ldsum+a[i][j];
				}
				if(j==2-i)
				{
					rdsum=rdsum+a[i][j];
				}
				//System.out.println(a[i][j]);
				
			}
			//System.out.println();
		}
		System.out.println("Left sum="+ldsum);
		System.out.println("Right sum="+rdsum);
	}
}