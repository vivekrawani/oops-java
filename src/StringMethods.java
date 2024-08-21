public class StringMethods {
    public static void main(String[] args) {
//        String s = "A very long string to test out string methods.";
        String s = "Small string";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }
        System.out.println(s.substring(0, 1));
    }
}
