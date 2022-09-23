package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 3:32
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class BreakingTheRecords {

    public static int[] breakingRecords(int[] scores) {
        int min = scores[0], max = scores[0], countMin = 0, countMax = 0;

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
                countMax++;
            }
            else if(scores[i] < min) {
                min = scores[i];
                countMin++;
            }
        }
        //  return array {max, min}
        return new int[]{countMax, countMin};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, values;

        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= 1000) );

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            values = scan.nextInt();
            if(values >= 0 && values <= Math.pow(10,8))
                scores[i] = values;
            else 
                i--;
        }
        scan.close();
        int[] records = breakingRecords(scores);
        for (int x: records)
            System.out.print(x + " ");
    }
}
