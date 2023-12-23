//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int count=n/k;
        int count1=0;
        
        HashMap<Integer,Integer> hm =new HashMap<>();
        
        for(Integer i : arr)
        {
            if(hm.get(i)==null)
            {
                hm.put(i,1);
            }
            else
            {
                int d=hm.get(i);
                hm.put(i,d+1);
            }
        }
        
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>count)
            {
                count1++;
            }
        }
        return count1;
    }
}
