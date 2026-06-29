/*
Question 25: Move all zeros in an array to the end while maintaining the relative order of 
non-zero elements.
Input:
Array = [0, 1, 0, 3, 12]

Output:
Array = [1, 3, 12, 0, 0]

Explanation:
Traverse the array and shift all non-zero elements forward while keeping their order the same, 
then place all zeros at the remaining positions at the end.
*/
import java.util.Scanner;

class ForwardNonZero
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }

        while(j < n)
        {
            arr[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeros to end");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
