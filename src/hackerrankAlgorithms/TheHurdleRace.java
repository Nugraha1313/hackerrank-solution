package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 17:47
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class TheHurdleRace {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, int[] height) {
        int max = height[0];
        for (int i = 0; i < height.length; i++) {
            if(height[i] > max)
                max = height[i];
            if(i == (height.length - 1) && k >= max)
                return 0;
            else if(i == (height.length - 1) && k < max)
                return (max - k);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, k, value;

        do {
            n = scan.nextInt();
        } while(!(n >= 1 && n <= 100));

        do {
            k = scan.nextInt();
        } while(!(k >= 1 && k <= 100));

        int[] height = new int[n];

        for (int i = 0; i < height.length; i++) {
            value = scan.nextInt();
            if(value >= 1 && value <= 100)
                height[i] = value;
            else
                i--;
        }
        scan.close();
        System.out.println(hurdleRace(k, height));
    }
}
