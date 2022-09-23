package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 5:36
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class AppleAndOrange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = 0, countOranges = 0;

        // count Apples fallen
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
            if(apples[i] >= s && apples[i] <= t)
                countApples++;
        }

        // count oranges fallen
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
            if(oranges[i] >= s && oranges[i] <= t)
                countOranges++;
        }
        System.out.println(countApples + "\n" + countOranges);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s, t, a, b, d, m, n;

        do {
            s = scan.nextInt();
            t = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();
            m = scan.nextInt();
            n = scan.nextInt();
        } while( !(s >= 1 && s <= Math.pow(10, 5)) || !(t >= 1 && t <= Math.pow(10, 5)) || !(a >= 1 && a <= Math.pow(10, 5)) || !(b >= 1 && b <= Math.pow(10, 5)) || !(m >= 1 && m <= Math.pow(10, 5)) || !(n >= 1 && n <= Math.pow(10, 5)) || !(a < s) || !(s < t) || !(t < b));

        int[] apples = new int[m];
        int[] oranges = new int[n];
        // apples input
        for (int i = 0; i < apples.length; i++) {
            d = scan.nextInt();
            if(d >= Math.pow(-10, 5) && d <= Math.pow(10, 5))
                apples[i] = d;
            else
                i--;
        }
        // orange input
        for (int i = 0; i < oranges.length; i++) {
            d = scan.nextInt();
            if(d >= Math.pow(-10, 5) && d <= Math.pow(10, 5))
                oranges[i] = d;
            else
                i--;
        }
        scan.close();
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
