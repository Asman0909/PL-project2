
import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int time;
        if (n <= k) {
            time = 2 * m;
        } else {
            int sides = 2 * n;
            int b = (sides + k - 1) / k;
            time = b * m;
        }

        System.out.println(time);
    }
}