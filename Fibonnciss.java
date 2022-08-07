import java.util.*;

public class Fibonnciss {
    public static void main(String[] args) {

        int a = 0, b = 1, c, i, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 0; i < num; i++) {
            System.out.print(a + " ");  //always print a so we take  i=0
            c = a + b;
            a = b;
            b = c;

        }
    }
}
