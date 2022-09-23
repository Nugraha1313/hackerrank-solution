package hackerrankAlgorithms;
/*
 * @created 25/05/2022 on 23:17
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, value, i = 0, sum = 0;
        do {
            n = scan.nextInt();
        } while( !(n > 0 && n <= 1000) );

        int[] ar = new int[n];

        // input nilai,sebanyak n, jika valid masukkan ke array

        do {
            value = scan.nextInt();
            if(value > 0 && value <= 1000) {
                ar[i] = value;
                i++;
            }
        } while( !(value > 0 && value <= 1000) || i < n );

        //sum
        for (int j = 0; j < ar.length; j++)
            sum += ar[j];
        System.out.println(sum);

        scan.close();
    }
}
