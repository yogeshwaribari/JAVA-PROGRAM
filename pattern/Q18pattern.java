/*Q18. Write a java program to print this pattern.  
 *  *  *  *  *  *
  *  *  *  *  *
   *  *  *  *
	*  *  *
	  *  *
	   *
	   */
class Q18pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i-j<=0 && i-j>=-5)
				{
					System.out.print(" *  ");
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