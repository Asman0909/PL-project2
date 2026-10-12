import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if ((a > 0 && c > 0 || a < 0 && c < 0) && (b > 0 && d > 0 || b < 0 && d < 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}