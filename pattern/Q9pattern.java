/*Q9. Write a java program to print this pattern.
            *               
	     *  *  *       		
	  *  *  *  *  * 
   *  *  *  *  *  *  * 
*  *  *  *  *  *  *  *  * 		*/

class Q9pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j>=6 && i-j>=-4)
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