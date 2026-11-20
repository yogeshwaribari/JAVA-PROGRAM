/*
* 
* * 
* * *
* 
* *
* * *
*/
class Q27pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i-j>=0 && i<=3)
				{
					System.out.print(" *");
				}
				else if(i-j>=3 && i>3)
				{
					System.out.print(" *");
				}
				else if(i-j<=2)
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}