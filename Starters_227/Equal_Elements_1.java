import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_Elements_1
{ // Difficulty : 1718
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Set<Integer> haveSeen = new HashSet<>();
		    int goodSeq = 0;
		    for(int i = 0; i < n; i++){
		        int val = sc.nextInt();
		        if(haveSeen.contains(val)){
		            goodSeq++;
		            haveSeen.clear();
		        }else{
		            haveSeen.add(val);
		        }
		    }
		    int longestGoodSeq = goodSeq * 2;
		    System.out.println(longestGoodSeq);
		}

	}
}
