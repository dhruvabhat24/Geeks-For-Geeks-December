//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int k = sc.nextInt();
            int answer = new Solution().kSubstrConcat(n,s,k);
    		System.out.println(answer);
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        
        if(n%k!=0){
            return 0;
        } 
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i+k<=n;i=i+k){
            
            String str = s.substring(i, i+k);
            map.put(str, map.getOrDefault(str,0)+1);
            
        }
        
        
        if(map.size()>2){
            return 0;
        }
        
        if(map.size()==1){
            return 1;
        }
        
        boolean found = false;
        for(int i: map.values()){
            if(i==1){
                found = true;
            }
        }
        
        if(found==false){
            return 0;
        }
        
        return 1;
    }
}
