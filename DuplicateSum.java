import java.util.*;
import java.lang.*;
public class DuplicateSum {
    public static void FindSum(int num[]) {
        int sum=num[0];

        for(int i=0;i<num.length-1;i++){
            if(num[i] !=num[i+1]){
          sum= sum+num[i+1];
            }
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num[]={10,20,30,10,40,10,20};
        Arrays.sort(num);
       // int n= num.length-1;
        FindSum(num);
    }
}
