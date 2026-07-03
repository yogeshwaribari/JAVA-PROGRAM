import java.util.*;
public class BinarySearch
{
   public static void main(String x[])
   {
       Scanner xyz = new Scanner(System.in);
	   int arr[]=new int[10];
	   Arrays.sort(arr);  
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   {
	      arr[i]=xyz.nextInt();
	   }
	   System.out.println("Enter search key");
	   int skey=xyz.nextInt();
	   int L=0,R=(arr.length-1),mid=0;
	   int index=-1;
	   while(L<=R)
	   {
		    mid=L+(R-L)/2;
			if(arr[mid]==skey)
			{ index=mid;
		       break;
			} 
			if(arr[mid]<skey)
		    {  L=mid+1;
			}
			else{
				R=mid-1;
			}
	   }
	   if(index!=-1)
	   { System.out.println("Data found");
	   }
	   else
	   { System.out.println("Data not found");
	   }
   }
}
