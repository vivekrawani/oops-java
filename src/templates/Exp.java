package templates;

public class Exp {
    public static long exponent(int b, int exp){
        long  ans = 1;
        long base = b;
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }
        return ans;
    }

    public static int NthRoot(int n, int m){
        for (int i = 1; i <= m; i++) {
            long val = exponent(i, n);
            if (val == (long)m) return i;
            else if (val > (long)m) break;
        }
        return -1;
    }
    private static  int exponentModified(int mid, int n, int m){
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static int NthRootEnhanced(int n, int m){
       int low = 0; int high = m;
       while(low <= high) {
           int mid = low + (high - low) / 2;
           long val = exponentModified(mid, n, m);
           if (val == 1) return mid;
           else if (val == 2) {
               high = mid -1;
           } else {
               low = mid + 1;
           }
       }
        return -1;
    }
}
