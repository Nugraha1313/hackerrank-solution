package hackerrank30Days;
/*
 * @created 22/06/2022 on 10:36
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int temp, numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
//                    swap(a[j], a[j + 1]);
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0)
                break;
        }
        System.out.println("Array is sorted in " + numberOfSwaps +" swaps." +
                "\nFirst Element: " + a[0] +
                "\nLast Element: " + a[n - 1]);
    }
}
