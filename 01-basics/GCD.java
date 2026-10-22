
public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(12, 8)); // Output: 4
    }
}
