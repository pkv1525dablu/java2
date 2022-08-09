import java.util.*;
import java.lang.*;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("enter your num :");
        Scanner sc =new Scanner (System.in);
        int num=sc.nextInt();
          //int num=8;
       int count=0;
       for(int i=1;i<=num;i++) {
           if (num % i == 0) {
               count++;  // count karega how many time reminder =0;
           }
       }

        if (count==2) {
            System.out.println("prime ");        //   jisak factor only two ho
        } else {                                 //  1,2,3,4,5,6,7= (1,7) count =2
            System.out.println("not prime");
        }
    }
}
