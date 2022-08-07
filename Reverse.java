import java.util.*;
import java.lang.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = sc.nextInt();
        }

        // int num[] = {10, 20, 30, 40};
//swapp
        for (int i = 0; i <= num.length - 1; i += 2) {
            int first = num[i];
            num[i] = num[i + 1];
            num[i + 1] = first;
        }

        for (int i = 0; i <= num.length - 1; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

