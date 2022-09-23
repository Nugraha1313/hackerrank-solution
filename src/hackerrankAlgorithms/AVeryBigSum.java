package hackerrankAlgorithms;
/*
 * @created 25/05/2022 on 23:44
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class AVeryBigSum {

    public static long aVeryBigSum(int[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;

        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= 10) );

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            value = scan.nextInt();
            // jika valid
            if(value >= 0 && value <= Math.pow(10, 20))
                ar[i] = value;
            else
                i--;
        }
        scan.close();
        System.out.println(aVeryBigSum(ar));
    }
}
