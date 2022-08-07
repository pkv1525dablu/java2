
import java.util.*;
public class NumtoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 999)
            System.out.println("INVALID");

        else {
            int u = n % 10;
            int tt = n / 10;             //jnjnjnkjnkj
            int t = tt % 10;
            int h = n / 10;
            String[] td = {" ", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
            String[] ud = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
            String[] hd = {"Hundred"};

            if (n < 20) {
                System.out.println(ud[n]);
            } else if (n < 100) {
                System.out.println(td[t] + " " + ud[u]);
            } else {
                System.out.println(ud[h] + hd + td[t] + " " + ud[u]);
            }
        }
    }

}


