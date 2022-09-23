package hackerrankAlgorithms;
/*
 * @created 25/05/2022 on 23:53
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int totalLeftDiag = 0, totalRightDiag = 0, high = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j)
                    totalLeftDiag += arr[i][j];
                if(j == high)
                    totalRightDiag += arr[i][j];
            }
            high--;
        }
        return Math.abs(totalLeftDiag - totalRightDiag);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;

        do {
            n = scan.nextInt();
        } while( !(n > 1) );

        int[][] arr = new int[n][n];

        // isi nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                value = scan.nextInt();
                if(value >= -100 && value <= 100)
                    arr[i][j] = value;
                else
                    j--;
            }
        }
        System.out.println(diagonalDifference(arr));
    }

    public static void tampung2() {
        Scanner scan = new Scanner(System.in);

        int n, totalLeftDiag = 0, totalRightDiag = 0, value;

        do {
            n = scan.nextInt();
        } while( !(n > 1) );

        int high = n - 1;
        int[][] arr = new int[n][n];

        // isi nilai
        //baris
        for (int i = 0; i < n; i++) {
            //kolom
            for (int j = 0; j < n; j++) {
                value = scan.nextInt();
                if(value >= -100 && value <= 100)
                    arr[i][j] = value;
                else
                    j--;
            }
        }
        //get sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)
                    totalLeftDiag += arr[i][j];
                if(j == high)
                    totalRightDiag += arr[i][j];
            }
            high--;
        }
        System.out.println(Math.abs(totalLeftDiag - totalRightDiag));
    }

    public static void tampung() {
        Scanner scan = new Scanner(System.in);

        int n = 3, totalLeftDiag = 0, totalRightDiag = 0, high = n - 1;
        int[][] arr = new int[n][n];

        // isi nilai
        //baris
        for (int i = 0; i < n; i++) {
            //kolom
            for (int j = 0; j < n; j++)
                arr[i][j] = scan.nextInt();
        }

        //get sum
        for (int i = 0; i < n; i++) {
            //kolom
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.println("i == j | " + arr[i][j]);
                    totalLeftDiag += arr[i][j];
                }
                if(j == high) {
                    System.out.println("j == high | " + arr[i][j]);
                    totalRightDiag += arr[i][j];
                }
            }
            high--;
        }
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");
        System.out.println("Left : "+totalLeftDiag);
        System.out.println("Right : "+totalLeftDiag);
        System.out.println(Math.abs(totalLeftDiag - totalRightDiag));
    }

}
