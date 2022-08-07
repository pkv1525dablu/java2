import java.util.*;

public class Pelindrom {
    public static void main(String[] args) {
        int n, c, s = 0, r;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
           c=n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;

        }
        if(c==s){
            System.out.println("num is pelindrom");  // meeror image;
        }else {
            System.out.println(" not pelindrom num");
        }


    }
}




