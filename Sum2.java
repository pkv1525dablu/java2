import java.util.*;

public class Sum2 {
    public static void main(String args[]) {
        int sum = 0;
        int num[] = {1, 2, 3, 4, 10, 11};

        for (int i = 0; i <=num.length-1; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }

}

