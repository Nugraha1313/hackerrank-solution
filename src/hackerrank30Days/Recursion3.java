package hackerrank30Days;
/*
 * @created 20/06/2022 on 4:29
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Recursion3 {

    public static int factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }
}
