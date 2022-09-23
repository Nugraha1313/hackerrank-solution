package codeLeague1;
/*
 * @created 05/05/2022 on 19:34
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Arrays;
import java.util.Scanner;

public class DaduKaori {

//    public static int solution(int[] arr) {
//        int totalPoint = 0, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0;
//        //for(i) ado switch -> hitung pake counter
//        for (int i : arr) {
//            switch (i) {
//                case 1 -> counter1++;
//                case 2 -> counter2++;
//                case 3 -> counter3++;
//                case 4 -> counter4++;
//                case 5 -> counter5++;
//                case 6 -> counter6++;
//            };
//        }
//        //for(i) ado if -> totalPoint
//        if(counter1 == 1)
//            totalPoint += 100;
//        else if(counter1 == 2)
//            totalPoint += 200;
//        else if(counter1 == 3)
//            totalPoint += 1000;
//        else if(counter1 == 4)
//            totalPoint += 1100;
//        else if(counter1 == 5)
//            totalPoint += 1200;
//        if(counter2 >= 3)
//            totalPoint += 200;
//        if(counter3 >= 3)
//            totalPoint += 300;
//        if(counter4 >= 3)
//            totalPoint += 400;
//        if(counter5 == 1)
//            totalPoint += 50;
//        else if(counter5 == 2)
//            totalPoint += 100;
//        else if(counter5 == 3)
//            totalPoint += 500;
//        else if(counter5 == 4)
//            totalPoint += 550;
//        else if(counter5 == 5)
//            totalPoint += 600;
//        if(counter6 >= 3)
//            totalPoint += 600;
//
//        return totalPoint;
//    }

    public static int solution(int[] arr) {
        int totalPoint = 0, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0;
        //menghitung value, dan menambahkan point
        for (int i : arr) {
            switch (i) {
                case 1 -> {
                    counter1++;
                    if(counter1 == 3)
                        totalPoint += 800;
                    else
                        totalPoint += 100;
                }
                case 2 -> {
                    counter2++;
                    if(counter2 == 3)
                        totalPoint += 200;
                }
                case 3 -> {
                    counter3++;
                    if(counter3 == 3)
                        totalPoint += 300;
                }
                case 4 -> {
                    counter4++;
                    if(counter4 == 3)
                        totalPoint += 400;
                }
                case 5 -> {
                    counter5++;
                    if(counter5 == 3)
                        totalPoint += 400;
                    else
                        totalPoint += 50;
                }
                case 6 -> {
                    counter6++;
                    if(counter6 == 3)
                        totalPoint += 600;
                }
            }
        }

        return totalPoint;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int value, iterasi = 0;
        //input dadu 5x
        do {
            value = scan.nextInt();
            //jika valid masukkan ke arr
            if(value >= 1 && value <= 6) {
                arr[iterasi] = value;
                iterasi++;
            }
        } while( !(value >= 1 && value <= 6) || iterasi < arr.length);

        System.out.println(solution(arr));
        scan.close();
    }
}
