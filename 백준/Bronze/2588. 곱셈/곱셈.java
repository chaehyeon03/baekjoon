import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = B;
        while(B > 0) {
            System.out.println(A*(B%10));
            B /=10;
        }
        System.out.println(A*C);
    }
}