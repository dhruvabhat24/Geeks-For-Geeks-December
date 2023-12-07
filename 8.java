//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minNumber(int arr[], int N) {
        // Calculate the sum of the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Check if the sum is prime
        if (isPrime(sum)) {
            return 0; // Sum is already prime, no need to add any number
        }

        // Find the smallest positive number to make the sum prime
        int diff = 0;
        while (!isPrime(sum + diff)) {
            diff++;
        }

        return diff;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
