import java.util.*;
import java.lang.*;
import java.io.*;

class Sum_Not_Equal
{

    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t--> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");

            int[] a = new int[n];
            boolean allZero = true;

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
                if (a[i] != 0)
                    allZero = false;
            }

            if (allZero) {
                sb.append("-1\n");
                continue;
            }

            boolean found = false;

            for (int i = 0; i < n - 2 && !found; i++) {
                for (int j = i + 1; j < n - 1 && !found; j++) {
                    for (int k = j + 1; k < n; k++) {

                        if (a[i] + a[j] != a[k]) {
                            sb.append(i + 1).append(" ").append(j + 1).append(" ").append(k + 1).append("\n");
                            found = true;
                            break;
                            
                        }
                        else if (a[i] + a[k] != a[j]) {
                            sb.append(i + 1).append(" ").append(k + 1).append(" ").append(j + 1).append("\n");
                            found = true;
                            break;
                        }
                        else if (a[j] + a[k] != a[i]) {
                            sb.append(j + 1).append(" ").append(k + 1).append(" ").append(i + 1).append("\n");
                            found = true;
                            break;
                        }
                    }
                }
            }
            if (!found) {
                sb.append("-1\n");
                continue;
            }
        }

        System.out.print(sb);



    }
}