/*Q17. Write a java program to print this pattern.
        *   
	  *   *   
	*       *      
  *           * 
* * * * * * * * *      */

class Q17pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==5 ||i+j==6 ||i-j==-4)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}