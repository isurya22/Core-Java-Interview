package InterviewAsked;

import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to :");
        int number = sc.nextInt();

        int m = 0, n = 1, p;
        System.out.print(m+" "+n);
        //0 1 1
        for (int i = 2; i < number; ++i) {
           p = m + n;
            System.out.print(" "+p);
            m = n;
            n = p;

        }
    }
}
