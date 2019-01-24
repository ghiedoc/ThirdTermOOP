package thirdterm;

//Recursion
public class Review {

    public int convert(int n) {

        if (n <= 0) {
            return 0;
        }

        return n % 2 + 10 * convert(n / 2);

    }

    public static void permutation(String a, String s) {
        
        if (s.length() == 0) {
            System.out.println(a);
        } else {
            for (int i = 0; i < s.length(); i++) {
                permutation(a + s.charAt(i), s.substring(0, i) + s.substring(1 + i, s.length()));
            }
        }
    }

    public static void recurPermute(String str, String x) {

        int n = str.length();

        if (n == 0) {
            System.out.println(str);
        } else {
            if (n > 0) {
                recurPermute(str + str.charAt(n), x.substring(0, n) + x.substring(n + 1, n));
            }
        }

    }

    public String permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }
        
        str = change(str, l, r);
        return permute(str, l + 1, r);

    }

    public String change(String a, int first, int second) {
        char temp;
        char[] array_a = a.toCharArray();
        temp = array_a[first];
        array_a[first] = array_a[second];
        array_a[second] = temp;
        //System.out.println(String.valueOf(array_a));
        return String.valueOf(array_a);
    }

    public static void main(String[] args) {
        Review r = new Review();
        //r.sample("AAB", 2, 1);
        //System.out.println(r.convert(4));
        //System.out.println(r.permute("AAB", 0, 0));
        //System.out.println(r.recurPermute("AAB", "A"));
        //r.recurPermute("AAB", "A");
        permutation("", "ABA");
    }
}
