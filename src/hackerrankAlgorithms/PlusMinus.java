package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 1:04
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class PlusMinus {

    public static void plusMinus(int[] arr) {
        int positiveCounter = 0, negativeCounter = 0, zeroCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0)
                positiveCounter++;
            else if(arr[i] < 0)
                negativeCounter++;
            else
                zeroCounter++;
        }
        //Proportion
        double proportionPositive = (double) positiveCounter / (double) arr.length;
        double proportionNegative = (double) negativeCounter / (double) arr.length;
        double proportionZero = (double) zeroCounter / (double) arr.length;

        //output
        System.out.format("%.6f\n",proportionPositive);
        System.out.format("%.6f\n",proportionNegative);
        System.out.format("%.6f\n",proportionZero);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;

        do {
            n = scan.nextInt();
        } while( !(n > 0 && n <= 100) );

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            value = scan.nextInt();
            if(value >= -100 && value <= 100)
                arr[i] = value;
            else
                i--;
        }
        scan.close();
        plusMinus(arr);
    }
}
