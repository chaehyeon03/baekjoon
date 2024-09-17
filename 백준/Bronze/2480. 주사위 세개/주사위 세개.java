import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, r;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a==b && b==c) {
            r = 10000 + 1000 * a;
        }
        else if (a==b || b==c || c==a) {
            if (a == b || a == c) {
                r = 1000 + 100 * a;
            }
            else {
                r  = 1000 + 100 * b;
            }
        }
        else {
            int maxValue = Math.max(a, Math.max(b,c));
            r = maxValue * 100;
        }
        System.out.println(r);
    }
}