import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            if (b[0] == b[n - 1]) {
                System.out.println("YES");
                continue;
            }
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                if(b[i] == b[i - 1] && b[i] < b[n - 1]){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag == false ? "NO" : "YES");

        }
    }
}