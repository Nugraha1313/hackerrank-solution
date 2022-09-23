package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 1:27
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Staircase {

    public static void stairCase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("#");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            n = scan.nextInt();
        } while( !(n > 0 && n <= 100) );
        scan.close();
        stairCase(n);
    }
}
