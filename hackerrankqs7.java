import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String input = sc.next();
            BigInteger n = new BigInteger(input);

            boolean fits = false;

            try {
                long val = n.longValueExact();
                System.out.println(input + " can be fitted in:");

                if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");

                fits = true;
            } catch (ArithmeticException e) {
                // number does not fit in long
            }

            if (!fits) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
