//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java
class Solution{

    static int maxGold(int n, int m, int M[][])

    {

        // code here

        int[][] dp = new int[n][m];

        int mx = Integer.MIN_VALUE;

        for(int j = m-1; j>=0;j--){

            for(int i = 0; i<n;i++){

                if(j==m-1){

                    dp[i][j] = M[i][j];

                }else if(i==0){

                    dp[i][j]=M[i][j]+Math.max(dp[i][j+1],i+1<n?dp[i+1][j+1]:0); //handling single row input

                }else if(i==n-1){

                    dp[i][j]=M[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);

                }else{

                    dp[i][j] = M[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));

                }

                mx = Math.max(mx,dp[i][j]);

            }

        }

        return mx;

    }
  }
