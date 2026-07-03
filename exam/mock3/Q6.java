/*Q6. Create a class named PrimeArrayManager using a parameterized constructor that accepts an 
integer array.
The constructor should initialize the array, and the class should provide methods to perform the
 following operations:
1.
Separate all Prime Numbers and Non-Prime Numbers.
2.
Sort the Prime Numbers in Ascending Order.
3.
Sort the Non-Prime Numbers in Descending Order.
4.
Merge both arrays such that all sorted prime numbers appear first, followed by all sorted 
non-prime numbers.
5.Display the Prime Numbers, Non-Prime Numbers, and the Final Merged Array.
Do not use Java Collections or built-in sorting methods. Implement the sorting logic manually.
Input - Enter the size of array - 8
Enter the array elements - 15 7 11 20 13 4 17 9
Output - Prime Numbers : 7 11 13 17
Non Prime Numbers : 20 15 9 4
Final Array : 7 11 13 17 20 15 9 4*/
import java.util.*;
class PrimeArrayManager
{
	int arr[];
	
	PrimeArrayManager(int arr[])
	{
		this.arr=arr;
	}
	void performprime()
	{
		System.out.println("Prime Elements");
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					cnt++;
				}
			}
		
			if(cnt==2)
			{
				System.out.println(arr[i]);
			}
			Arrays.sort(arr);
			/*System.out.println("Asending");
			for(int k=0;k<arr.length;i++)
			{
				if(arr[i]<arr[k])
				{
					int temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
				}
				System.out.println(arr[k]);
			}*/
		
			
			
			
		}		
	}
	void nonprime()
	{
		
		System.out.println("Not Prime Elements");
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					cnt++;
				}
			}
		
			if(cnt!=2)
			{
				System.out.println(arr[i]);
				
			}
		
		}/*
			//System.out.println("Desending order");
			for(int k=arr.length-1;k>=0;k--)
			{
				System.out.println(arr[k]);
			}
			*/
		
		
	}
	
}
class Q6
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=xyz.nextInt();
		int num[]=new int[8];
		
		System.out.println("Enter Array elements");
		for(int i=0;i<num.length;i++)
		{
			num[i]=xyz.nextInt();
		}
		//num[i]=new NumberArray();
		PrimeArrayManager p=new PrimeArrayManager(num);
		p.performprime();
		p.nonprime();
	}
}