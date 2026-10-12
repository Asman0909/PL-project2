import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        if (Math.abs(x1-y1) == Math.abs(x2-y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}