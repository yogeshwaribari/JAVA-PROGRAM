/*Q7. Write a java program to print this pattern.   
*****  
 **** 
  *** 
   **    
    * 		*/
class Q7pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i-j<=0)
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