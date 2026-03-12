import java.util.*;
import java.lang.*;
import java.io.*;

class Sequential_Clamp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){

            int n = Integer.parseInt(br.readLine());
            int y = Integer.MAX_VALUE;;

            for(int i = 0; i < n; i++){

                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                if(y < a) {
                     y = a;
                } else if(y > b) {
                    y = b;
                }
            }

            sb.append(y).append("\n");
        }

        System.out.print(sb);

	}
}
