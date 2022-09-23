package codeLeague2;
/*
 * @created 24/06/2022 on 14:03
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class IllegalMovesByTheRook {

//    public static String checkRookMove(int n, int[] path) {
//        String output = "LEGAL";
//        for (int i = 1; i < path.length; i++) {
//            if (path[0] % 2 == 0) {
//                if (i % 2 != 0) {
//                    if (path[i] % 2 == 0) {
//                        output = "ILLEGAL";
//                        break;
//                    }
//                } else {
//                    if (path[i] % 2 != 0) {
//                        output = "ILLEGAL";
//                        break;
//                    }
//                }
//            } else {
//                if (i % 2 != 0) {
//                    if (path[i] % 2 != 0) {
//                        output = "ILLEGAL";
//                        break;
//                    }
//                } else {
//                    if (path[i] % 2 == 0) {
//                        output = "ILLEGAL";
//                        break;
//                    }
//                }
//            }
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = scan.nextInt();
//            int s = scan.nextInt();
//            int[] path = new int[s];
//            for (int j = 0; j < s; j++) {
//                path[j] = scan.nextInt();
//            }
//            System.out.println(checkRookMove(n,path));
//        }
//        scan.close();
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 5;
        int[] path = {2,7,6,9,8};
        String output = "LEGAL";
        for (int i = 1; i < s; i++) {
            //jika awal genap
            if( Math.abs(path[i] - path[i - 1]) > 3) {
                output = "ILLEGAL";
                break;
            }
            if (path[0] % 2 == 0) {
                // jika ke angka ke ganjil
                if (i % 2 != 0) {
                    if (path[i] % 2 == 0) {
                        output = "ILLEGAL";
                        break;
                    }
                } else {
                    if (path[i] % 2 != 0) {
                        output = "ILLEGAL";
                        break;
                    }
                }
            } else {
                if (i % 2 != 0) {
                    if (path[i] % 2 != 0) {
                        output = "ILLEGAL";
                        break;
                    }
                } else {
                    if (path[i] % 2 == 0) {
                        output = "ILLEGAL";
                        break;
                    }
                }
            }
        }
        System.out.println(output);
    }
}