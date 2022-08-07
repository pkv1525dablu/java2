import java.util.*;

public class Sum3 {
    /* package whatever; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

    public static void main(String[] args) throws java.lang.Exception {
        int marks[] = {5, 8, 9, 12, 12, 28, 5,};
        // your code goes here
        int i, sum = 0;
        Arrays.sort(marks);
        int len = marks.length - 1;

        for (i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len ; j++) {
                if (marks[i] ==marks[j]) {
                    System.out.println("duplicate num"+marks[j]);
                }

            }

            sum = sum + marks[i];
            if (marks[i] % 2 == 0) {

                System.out.println(marks[i] + " even number");

            } else {
                System.out.println(marks[i] + "odd num");
            }

        }
        System.out.println(sum);
    }


}
