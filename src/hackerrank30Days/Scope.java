package hackerrank30Days;
/*
 * @created 22/06/2022 on 3:56
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        // find max difference absolute
        int maxDifference = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                int abs = Math.abs(arr[i] - arr[j]);
                System.out.println("abs : " + abs);
                if(abs > maxDifference)
                    maxDifference = abs;
            }
        }
        System.out.println(maxDifference);
//        int maxDifference = Math.abs(arr[0] - arr[1]);
//        for (int i = 0; i < arr.length - 1; i++) {
//            int abs = Math.abs(arr[i] - arr[i + 1]);
//            if(abs > maxDifference)
//                maxDifference = abs;
//        }
//        System.out.println(maxDifference);
    }
}
