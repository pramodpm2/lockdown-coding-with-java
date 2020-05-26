'''
Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
Example
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]

Input: First line should read number of array elements. Second Line should read the array elements which includes atleast two 10.

Output: Array which contains elements without 10. Refer the examples.
''''

import java.io.*; 
class PushZero 
{ 

    

    static void pushZerosToEnd(int arr[], int n) 

    { 

        int count = 0;  

        for (int i = 0; i < n; i++) 

            if (arr[i] != 10) 

                arr[count++] = arr[i];
        while (count < n) 

            arr[count++] = 0; 

    } 
    public static void main (String[] args) 

    { 

        int arr[] = {1, 9, 8, 4, 10, 10, 2, 7, 10, 6, 10, 9}; 

        int n = arr.length; 

        pushZerosToEnd(arr, n); 

        System.out.println("Array after pushing zeros to the back: "); 

        for (int i=0; i<n; i++) 

            System.out.print(arr[i]+" "); 

    } 
} 
