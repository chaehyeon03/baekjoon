import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        int N = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            long a = scan.nextLong();
            int b = scan.nextInt();
            sum += a * b;
        }
        if (sum == X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}