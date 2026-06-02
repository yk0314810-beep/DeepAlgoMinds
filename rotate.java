import java.util.*;

public class Solution {

    public static void circularArrayRotation(int[] a, int k, int[] queries) {
        int n = a.length;
        k = k % n;

        for (int q : queries) {
            int originalIndex = (q - k + n) % n;
            System.out.println(a[originalIndex]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        circularArrayRotation(a, k, queries);

        sc.close();
    }
}