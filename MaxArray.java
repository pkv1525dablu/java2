import java.util.*;
import java.lang.*;

public class MaxArray {
    public static void main(String[] args) {



        int marks[] = {10, 20, 30, 40, 80, 50};

        Arrays.sort(marks);


        for (int n : marks) {
            System.out.print(n + " ");
        }
    }

}
