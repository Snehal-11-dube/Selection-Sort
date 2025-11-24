package dsa;

import java.util.Scanner;
public class SelectionSort
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements to sort: ");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.print("Enter elements to sort: ");
        for(int i =0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }

        int temp =0;
        for(int i = 0; i<n-1; i++)
        {
            int minIndex = i;

            for(int j = i+1;  j<n; j++)
            {
                if(A[j]<A[minIndex])       //For descending order condition -> if(A[j]>A[minIndex])
                {
                    minIndex = j;
                }
            }

            temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

        System.out.println("Sorted Array: " );
        for(int i =0; i<n; i++)
        {
            System.out.println(A[i]);
        }
    }
}

