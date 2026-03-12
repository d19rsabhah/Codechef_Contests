import java.util.*;
import java.lang.*;
import java.io.*;

class Vacation_Excitement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        StringTokenizer token = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(token.nextToken());
        int y = Integer.parseInt(token.nextToken());

        int res = y + (x - 1);

        sb.append(res);

        System.out.print(sb.toString());

	}
}
