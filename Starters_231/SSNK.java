import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l = str.length();
		if(str.charAt(0) == 's' || str.charAt(l - 1) == 's'){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}

	}
}
