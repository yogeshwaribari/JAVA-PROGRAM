/*Q19. Write a java program to print this pattern.   
*           *
* *       * *
*   *   *   *
*     *     *
*   *   *   * 
* *       * *
*           *      */
class Q19pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1||j==7||i-j==0||i+j==8)
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