public class LeapYear {
    public static void main(String[] args) {
        int num = 2020;

        if (num % 400 == 0) {
            System.out.println("yera is leap year"+ " "+ num);
        } else if (num % 4 == 0 && num % 100 != 0) {
            System.out.println("year is leap year"+ " "+ num);
        } else {
            System.out.println("not leap year" +" "+ num);
        }
    }
}
