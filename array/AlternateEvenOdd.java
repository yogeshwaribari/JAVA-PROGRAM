/*
Question 29: Rearrange the array so that even and odd numbers alternate. Assume the number of 
even and odd elements is equal.
Input:
Array = [1, 2, 3, 4, 5, 6]

Output:
Array = [2, 1, 4, 3, 6, 5]

Explanation:
Place an even number first followed by an odd number repeatedly until all elements are arranged 
alternately.
*/
import java.util.Scanner;
class AlternateEvenOdd
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		int e[]=new int[a.length/2];
		int o[]=new int[a.length/2];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int en=0;
		int on=0;
		System.out.println("result array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e[en++]=a[i];
			}
			else
			{
				o[on++]=a[i];
			}
		}
		int j=0;
		for(int i=0;i<e.length;i++)
		{
			a[j++]=e[i];
			a[j++]=o[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
/*
import java.util.Scanner;
class AlternateEvenOdd
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[6];

        System.out.println("Enter array elements");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = xyz.nextInt();
        }

        for(int i = 0; i < a.length; i += 2)   // even index
        {
            if(a[i] % 2 != 0)   // if odd at even position
            {
                for(int j = i+1; j < a.length; j++)
                {
                    if(a[j] % 2 == 0)   // find even number
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.println("Result Array:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}*/
