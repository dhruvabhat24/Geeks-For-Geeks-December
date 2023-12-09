//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
}
// } Driver Code Ends


class Solution{
    
    public static boolean Ans(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum ==0)return true;
        return false;
    }
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        for(int size = 1;size<=n;size++){
            for(int i = 0;i<=n-size;i++){
                int []arr1 = new int[size];
                int k= 0;
                
                for(int j=i;j<i+size;j++){
                    arr1[k++] = arr[j] ;
                    
                }
                if(Ans(arr1) == true)return true;
            }
        }
        return false;
    }
  }
