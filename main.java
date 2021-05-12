import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter the number you wish to sum its digits");
        Scanner kbd = new Scanner (System.in);
        int number = kbd.nextInt();
        System.out.println(digitSum(number));
        System.out.println("You want the sum of the first how many natural numbers?");
        int upToNumber = kbd.nextInt();
        System.out.println(recur_sum(upToNumber));
    }
    public static int digitSum (int n) {
        if (n > 10) return (n % 10) + digitSum(n/10);
        else return n;
    }
    static int digit = 0;
    public static int recur_sum(int n) {
        if (digit < n) {
            digit++;
            return digit + recur_sum(n);
        }
        else return 0;
    }
}
