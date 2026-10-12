import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0) {
            System.out.println("NO");
        } else if (b % a != 0) {
            System.out.println("NO");
        } else {
            long x = -b / a;

            if (c * x + d != 0) {
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
    }
}