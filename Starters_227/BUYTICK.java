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
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String s = sc.next();
            int count = 0;
            for (char ch: s.toCharArray()) {
                if (ch == '0') {
                    count++;
                }
            }
            if (count < k) {
                System.out.println(-1);
            } else {
                ArrayList < Integer > list = new ArrayList < > ();
                int totalSum = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        list.add(arr[i]);
                    }
                }
                Collections.sort(list);
                for (int x: list) {
                    if (k > 0) {
                        totalSum += x;
                        k--;
                    }
                }
                
                System.out.println(totalSum);

            }
        }
    }
}