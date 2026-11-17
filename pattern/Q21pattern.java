/*
Q21. Write a java program to print this pattern.   
* * * * *       
 *     * 
  *   *        
   * *   
    *  
*/
class Q21pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				
				if(i-j==0||i+j==10 ||(i==1&&j%2!=0))
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
