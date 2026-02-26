import java.util.*;
import java.lang.*;
import java.io.*;

class Bank_Glitch
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int possible_trade = a / x;
		    int curr = a + b;
		    System.out.println(curr + possible_trade * (y - x));
		}

	}
}
