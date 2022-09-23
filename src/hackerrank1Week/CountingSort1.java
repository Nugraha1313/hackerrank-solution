package hackerrank1Week;
/*
 * @created 26/05/2022 on 21:59
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class CountingSort1 {

//    public static int[] countingSort(int[] arr) {
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == j)
//                    result[j] += 1;
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n, value;
//
//        do {
//            n = scan.nextInt();
//        } while( !(n >= 100 && n <= Math.pow(10, 6)) );
//
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            value = scan.nextInt();
//            if(value >= 0 && value < 100)
//                arr[i] = value;
//            else
//                i--;
//        }
//        scan.close();
//        int[] result = countingSort(arr);
//        for (int res: result)
//            System.out.print(res + " ");
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] frequencies = new int[100];
        for(int i = 0; i < n; i++){
            int num = input.nextInt();
            frequencies[num] += 1;
        }
        for (int frequency : frequencies)
            System.out.print(frequency + " ");
    }
}
