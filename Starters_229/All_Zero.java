import java.util.*;
import java.lang.*;
import java.io.*;

class All_Zero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){

            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            
            int temp = (2 * a) + (c / 3);

            if(c % 3 == 0 && b == temp)
                sb.append("Yes\n");
            else
                sb.append("No\n");
        }

        System.out.print(sb);

	}
}
