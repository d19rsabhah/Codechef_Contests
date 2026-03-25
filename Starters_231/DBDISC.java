import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++){
		        a[i] = sc.nextInt();
		    }
		    int b[] = new int[n];
		    for(int i = 0; i < n; i++){
		        b[i] = sc.nextInt();
		    }
		    
		    int maxTest = 0;
		    for(int i = 0; i < n; i++){
		        for(int f = i + 1; f < n; f++){
		            int low = Math.min(a[i], a[f]);
		            int high = Math.max(a[i], a[f]);
		            int fify_percent = high / 2;
		            int acceptedDiscount = Math.min(fify_percent, 100);
		            int high_price = high - acceptedDiscount;
		            int total_price = high_price + low;
		            if(total_price <= k){
		                int test = b[i] + b[f];
		                maxTest = Math.max(maxTest, test);
		            }
		        }
		    }
		    System.out.println(maxTest);
		    
		}
	}
}
