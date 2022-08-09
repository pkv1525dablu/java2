import java.util.*;

public class FactorialNumber {

    public static void main(String[] args) {
        System.out.print("eneter your num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i >0; i--) {
            factorial = factorial * i;

        }
        System.out.print(factorial);
    }
}
