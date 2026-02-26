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
            int s = sc.nextInt();
            int step1 = 5 * n;
            int diff = s - step1;
            int max = 6 * n;
            System.out.println(max - (0 > diff ? 0 : diff));
        }

    }
}