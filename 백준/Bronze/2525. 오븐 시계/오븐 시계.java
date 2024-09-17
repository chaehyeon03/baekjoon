import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        b += c;

        if (b >= 60) {
            a += b / 60;
            b = b % 60;
        }
        if (a >= 24) {
            a -= 24;
        }
        System.out.println( a + " " + b );
    }
}