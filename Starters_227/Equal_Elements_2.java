import java.util.*;

class Equal_Elements_2
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Map <Integer, Integer> fIdx = new HashMap < > ();
            int lastUsed = Integer.MIN_VALUE;
            int mxSeq = 0;

            for (int i = 0; i < n; i++) {
                int val = b[i];

                if (fIdx.containsKey(val) && fIdx.get(val) > lastUsed) {
                    mxSeq = mxSeq + 2;
                    lastUsed = i;
                    fIdx.remove(val);
                } else {
                    fIdx.put(val, i);
                }
            }

            System.out.println(mxSeq);
        }
    }
}