package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 2:30
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(int[] candles) {
        int countMax = 0, max = candles[0];
        // cari nilai max
        for (int candle : candles) {
            if (candle >= max)
                max = candle;
        }
        // hiitung kemunculan max
        for (int candle : candles) {
            if (candle == max)
                countMax++;
        }

        return countMax;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;
        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= Math.pow(10, 5)) );

        int[] candles = new int[n];
        for (int i = 0; i < candles.length; i++) {
            value = scan.nextInt();
            if(value >= 1 && value <= Math.pow(10, 7))
                candles[i] = value;
            else
                i--;
        }
        scan.close();
        System.out.println(birthdayCakeCandles(candles));
    }
}
