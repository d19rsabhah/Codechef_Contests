import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int l = str.length();
		String str1 = str.substring(l - 3, l);
		if(str1.equals("nta")){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		

	}
}
