package hackerrank1Week;
/*
 * @created 26/05/2022 on 5:04
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
        scan.close();
    }
}
