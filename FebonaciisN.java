import java.util.*;
public class FebonaciisN {
    public static void main(String[] args) {
        int a = 0, b = 1, c,n;
        System.out.println("enter your num");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
