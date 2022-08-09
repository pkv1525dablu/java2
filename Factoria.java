import java.util.*;
import java.lang.*;

public class Factoria {
    public static void main(String[] args) {
        System.out.println("enter your num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }

        }


    }
}
