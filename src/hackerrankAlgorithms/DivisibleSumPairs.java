package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 21:23
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int countPairs = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if(i < j && (ar[i] + ar[j]) % k == 0)
                    countPairs++;
            }
        }
        return countPairs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n, k, value;

        do {
            n = scan.nextByte();
        } while( !(n >= 2 && n <= 100) );

        do {
            k = scan.nextByte();
        } while( !(k >= 1 && k <= 100) );
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            value = scan.nextByte();
            if(value >= 1 && value <= 100)
                ar[i] = value;
            else
                i--;
        }
        scan.close();
        System.out.println(divisibleSumPairs(n, k, ar));
    }
}
