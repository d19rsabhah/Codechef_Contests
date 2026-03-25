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
		    int r = 0;
		    while(true){
		        int impNum1 = n - r;
		        int impNum2 = n + r;
		        
		        if(impNum1 > 0 && imperfectNum(impNum1)){
		            System.out.println(r);
		            break;
		        }else if(imperfectNum(impNum2)){
		            System.out.println(r);
		            break;
		        }
		        r++;
		    }
		}

	}
	public static boolean imperfectNum(int num){
	    boolean a = (num % 2 == 0);
	    boolean b = (num % 5 == 0);
	    return a ^ b;
	}
}
