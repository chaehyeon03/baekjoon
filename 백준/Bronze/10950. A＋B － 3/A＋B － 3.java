import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            results[i] = a + b;
        }
        for (int result : results) {
            System.out.println(result);
        }
    }
}