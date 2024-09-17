import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;

        n = scan.nextInt();

        for (int i = 1; i <= 9; i++){
            r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }
}